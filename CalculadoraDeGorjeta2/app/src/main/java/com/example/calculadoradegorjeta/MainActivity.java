package com.example.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText valorDigitado;
    private TextView textPorcentagem;
    private SeekBar seekBarPorcentagem;
    private TextView txgorjeta;
    private TextView txtotal;

    private double pocentagem = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorDigitado = findViewById(R.id.valorDigitado);
        textPorcentagem = findViewById(R.id.porcentagem);
        seekBarPorcentagem = findViewById(R.id.seekBarPorcentagem);
        txgorjeta = findViewById(R.id.gorjeta);
        txtotal = findViewById(R.id.total);

        seekBarPorcentagem.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pocentagem = progress;
                textPorcentagem.setText(Math.round(pocentagem) + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    public void calcular(){

        String valorRecuperado = valorDigitado.getText().toString();


        if (valorRecuperado == null || valorRecuperado.equals("")){
            Toast.makeText(getApplicationContext(), "Digite um valor", Toast.LENGTH_SHORT).show();
        }else {

            double valorDigitado = Double.parseDouble(valorRecuperado);

            double gorjeta =  valorDigitado * (pocentagem / 100);

            double total = valorDigitado + gorjeta;


            txgorjeta.setText("R$" + (gorjeta));

            txtotal.setText("R$" + total);



        }



    }

}