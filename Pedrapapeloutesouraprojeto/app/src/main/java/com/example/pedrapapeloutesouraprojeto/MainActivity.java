package com.example.pedrapapeloutesouraprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView img = findViewById(R.id.imageView5);
        TextView resposta = findViewById(R.id.textView2);
        TextView vitorias = findViewById(R.id.vitorias);
        TextView derrotas = findViewById(R.id.derrotas);

        int numero = new Random().nextInt(3); //0,1,2
        String[] opcoes = {"Pedra","Papel","Tesoura"};
        String opcaoApp = opcoes[numero];
        switch ( opcaoApp ){

            case "Pedra":
                    img.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                    img.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                    img.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opcaoApp == "Pedra" && opcaoSelecionada == "Tesoura") ||
                (opcaoApp == "Tesoura" && opcaoSelecionada == "Papel") ||
                (opcaoApp == "Papel" && opcaoSelecionada == "Pedra")
                
                
        ) { //app ganhador

            resposta.setText("Você Perdeu");

        }else if (
                (opcaoSelecionada == "Pedra" && opcaoApp == "Tesoura") ||
                (opcaoSelecionada == "Tesoura" && opcaoApp == "Papel") ||
                (opcaoSelecionada == "Papel" && opcaoApp == "Pedra")
        ){ // usuario ganhador
            
            resposta.setText("Você Ganhou");


        }else{ // empate
            resposta.setText("Empate");
        }




        //System.out.println(opcaoApp);
    }


}