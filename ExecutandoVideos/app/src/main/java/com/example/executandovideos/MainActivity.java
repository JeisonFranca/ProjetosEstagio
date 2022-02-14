package com.example.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirVideo(View view){

        // TODO: PODE CRIAR UMA VARIAVEL PARA INTENT
        Intent intent = new Intent(this, PlayerActivity.class);

        // TODO: ABRI UMA NOVA ACTIVITY
        startActivity(new Intent(this, PlayerActivity.class));

    }
}