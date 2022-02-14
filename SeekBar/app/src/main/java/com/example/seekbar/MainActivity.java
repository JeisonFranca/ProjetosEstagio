package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView resposta;
    private TextView resposta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        resposta = findViewById(R.id.resposta);
        resposta2 = findViewById(R.id.resposta2);

        resposta.setVisibility(View.GONE);
        resposta2.setVisibility(View.GONE);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    resposta.setText("Progresso: " + progress + "/" + seekBar.getMax());
                    resposta.setVisibility(View.VISIBLE);

                    if (progress == 0){
                        resposta.setVisibility(View.GONE);
                    }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }

        public void recuperar(View view){

            resposta2.setText("Valor Recuperado: " + seekBar.getProgress());
            resposta2.setVisibility(View.VISIBLE);

        }

}