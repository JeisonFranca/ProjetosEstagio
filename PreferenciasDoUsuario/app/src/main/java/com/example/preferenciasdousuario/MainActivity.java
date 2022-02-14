package com.example.preferenciasdousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.ToDoubleBiFunction;

public class MainActivity extends AppCompatActivity {

    private Button buttonSalvar;
    private EditText Editnome;
    private TextView resposta;

    // TODO:  NOME DO ARQUIVO
    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Editnome = findViewById(R.id.nome);
        resposta = findViewById(R.id.resposta);
        buttonSalvar = findViewById(R.id.buttonSalvar);


        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO: CLASSE PARA SALVAR AS PREFERENCIAS DO USUÁRIO
                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                // TODO: RECEBE O FORMATO EDITOR
                SharedPreferences.Editor editor =  /*RETORNO DE UM OBJETO DO TIPO EDITOR*/ preferences.edit();
                // TODO: VALIDAR NOME
                if(Editnome.getText().toString().equals("") || Editnome.getText().toString() == null){
                    Toast.makeText(getApplicationContext(), "Preencha o nome", Toast.LENGTH_SHORT).show();

                }else {
                    String nome = Editnome.getText().toString();
                    // TODO: COLOCA O VALOR DENTRO DE UMA CHAVE (CHAVE,VALOR)
                    editor.putString("nome", nome);
                    // TODO: SALVA
                    editor.commit();
                    resposta.setText("Olá " + nome);
                }
            }
        });

        // TODO: RECUPERAR DADOS SALVOS
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);

        // TODO:  VALIDA SE TEMOS O NOME EM PREFERENCIAS
        if (preferences.contains("nome")){
            // TODO: RECUPERA A STRING DA CHAVE / SUBSTITUI SE NÃO ENCONTRAR
            String nome = preferences.getString("nome", "");

            resposta.setText("Olá " + nome);

        }else{
            resposta.setText("Olá, usuário não definido");
        }
    }
}