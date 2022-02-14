package com.example.recicleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Model.Filme;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //define o layout do recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        //Listagem de filmes

        this.criarFilmes();


        //configurar adapter

        Adapter adapter = new Adapter( listaFilmes );

        //configurar RecyclerView
        recyclerView.setLayoutManager(layoutManager);
        //precisa criar o adapter
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);

        //evento de clique
        recyclerView.addOnItemTouchListener(

                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(), filme.getTituloFilme(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(), filme.getAno(), Toast.LENGTH_SHORT).show();
                            }
                        }
                )

        );
    }

    public void criarFilmes(){

        Filme filme = new Filme("Titulo1","Genero1","2017-1");
        this.listaFilmes.add(filme);

        filme = new Filme("Titulo2","Genero2","2017-2");
        this.listaFilmes.add(filme);

        filme = new Filme("Titulo3","Genero3","2017-3");
        this.listaFilmes.add(filme);


    }
}