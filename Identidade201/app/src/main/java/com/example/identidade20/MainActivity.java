package com.example.identidade20;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText campoDeBusca;
    private Button botaoBuscar;
    private RecyclerView recyclerView;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        campoDeBusca = findViewById(R.id.CampoDeBusca);
        botaoBuscar = findViewById(R.id.botaoBuscar);
        botaoBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buscar();
            }
        });
    }

    public void abrirActivity(){
        Intent intent = new Intent(this, Informacaoes.class);
        startActivity(intent);
    }

    public void buscar() {

        String dados = campoDeBusca.getText().toString();

        Call<List<Funcionarios>> call;

        if (isInteger(dados)){

            call = new RetrofitConfig().getFunService().buscarFuncionarioPorMatricula(
                    "retornaFuncPorMatricula",
                    dados
            );
        }else {
            call = new RetrofitConfig().getFunService().buscarFuncionarioPorSetor(
                    "retornaFuncPorSetor",
                    dados
            );
        }

        call.enqueue(new Callback<List<Funcionarios>>() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onResponse(Call<List<Funcionarios>> call, Response<List<Funcionarios>> response) {

                Log.e("url",call.request().url().toString());

                if(response.isSuccessful()){

                    List<Funcionarios> listaDeFuncionarios = response.body();

                    if (listaDeFuncionarios.size() == 0){
                        Log.e("FunService   ", "Tamanho Funcionario:" + listaDeFuncionarios.size());
                        Toast.makeText(context, "Funcionario ou setor não encontrado", Toast.LENGTH_SHORT).show();
                    }

                    Log.e("tamanho", String.valueOf(listaDeFuncionarios.size()));

                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                    Adapter adapter = new Adapter(listaDeFuncionarios, context);
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                            getApplicationContext(),
                            recyclerView,
                            new RecyclerItemClickListener.OnItemClickListener() {
                                @Override
                                public void onItemClick(View view, int position) {
                                    Log.i("clique","um clique");
                                   abrirActivity();
                                }

                                @Override
                                public void onLongItemClick(View view, int position) {

                                }

                                @Override
                                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                                }
                            }
                    ));

                }
            }

            @Override
            public void onFailure(Call<List<Funcionarios>> call, Throwable t) {
                Log.e("ola","Erro" + t.getMessage());
                Toast.makeText(getApplicationContext(), "matrícula ou setor inválido", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }

}