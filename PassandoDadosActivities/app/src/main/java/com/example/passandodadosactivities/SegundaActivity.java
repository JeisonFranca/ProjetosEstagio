package com.example.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private TextView textIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

            //RECUPERANDO DADOS..

        Bundle dados = getIntent().getExtras();

            //CRIAR O TIPO DE DADO QUE VAI SE RECUPERADO

        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        // PASSADO OBJETOS...

        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        textNome.setText(nome);
        textIdade.setText(String.valueOf(idade));

        textNome.setText(usuario.getEmail());


    }
}