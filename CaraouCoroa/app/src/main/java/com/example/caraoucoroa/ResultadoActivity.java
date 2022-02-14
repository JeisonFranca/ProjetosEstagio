package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageView = findViewById(R.id.imageView);

        Bundle numero = getIntent().getExtras();

        int i = numero.getInt("i");

        if (i == 0){
            imageView.setImageResource(R.drawable.moeda_cara);
        }else {
            imageView.setImageResource(R.drawable.moeda_coroa);
        }




    }

    public void voltar(View view){

        finish();

    }

}