package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSnackBar = findViewById(R.id.buttonSnackBar);
        buttonSnackBar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                Snackbar.make(
                        v, "botão clicado", Snackbar.LENGTH_INDEFINITE
                ).setAction("confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        /*buttonSnackBar.setText("Botão Alterado");*/

                        if (buttonSnackBar.getText() == "Botão Alterado" ){

                             buttonSnackBar.setText("Botão Alterado 2");

                        }else {

                            buttonSnackBar.setText("Botão Alterado");

                        }

                    }
                }).setActionTextColor(getResources().getColor(R.color.rosa))
                        .show();

            }
        });

    }

    /*public void clicar(View v){
        Snackbar.make(v,"botão", Snackbar.LENGTH_LONG);

    }*/


}