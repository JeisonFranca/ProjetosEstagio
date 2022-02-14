package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resposta(View view){

        Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

        int i = new Random().nextInt(2);

        intent.putExtra("i", i);

        startActivity(intent);



    }
}