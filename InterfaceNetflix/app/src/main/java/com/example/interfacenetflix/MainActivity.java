package com.example.interfacenetflix;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Texto(View view){
        TextView nome = findViewById(R.id.textView7);
        int x = new Random().nextInt(11);
        nome.setText("Numero Aleatório: " + x);

    }
}