package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        resultado = findViewById(R.id.resultado);

    }

    public void calcular(View view){

        String alcool = editPrecoAlcool.getText().toString();
        String gasolina = editPrecoGasolina.getText().toString();

        boolean camposValidados = validacao(alcool, gasolina);
        if (camposValidados){

            Double valorAlcool = Double.parseDouble(alcool);
            Double valorGasolina = Double.parseDouble(gasolina);

            Double resposta = valorAlcool / valorGasolina;

            if (resposta >= 0.7){

                resultado.setText("Melhor usar Gasolina");
            }else {

                resultado.setText("Melhor usar Álcool");
            }


        }else {
            resultado.setText("Preeencha os campos.");
        }

    }

    public boolean validacao(String alcool, String gasolina){

        boolean camposValidados = true;

        if (alcool == null || gasolina == null || alcool.equals("") || gasolina.equals("") ){

            camposValidados = false;

        }
        return camposValidados;
    }
}

