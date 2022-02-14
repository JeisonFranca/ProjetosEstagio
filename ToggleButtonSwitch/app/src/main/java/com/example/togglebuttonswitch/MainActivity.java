package com.example.togglebuttonswitch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

   /* private Switch switchSenha;
    private ToggleButton toggleSenha;
    private TextView resultado;*/

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*switchSenha = findViewById(R.id.switchSenha);
        toggleSenha = findViewById(R.id.toggleSenha);
        resultado = findViewById(R.id.textResultado);

        listener();*/

    }


    public void alertDialog(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Titulo");
        dialog.setMessage("Mensagem");
        dialog.setCancelable(false);
        dialog.setIcon(R.drawable.q);

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Você clicou no Sim", Toast.LENGTH_SHORT).show();
            }
        });


        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Você clicou no Não", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.create();
        dialog.show();

    }


   /* public void openToast(View view){

        ImageView imagem = new ImageView(this); // pode usar this ou getApplicationContext()
        imagem.setImageResource(R.drawable.q);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(imagem);
        toast.show();

        *//*Toast.makeText(getApplicationContext(), "ola", Toast.LENGTH_SHORT).show();*//*

    }*/

   /* public void listener(){

        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (toggleSenha.isChecked()){
                    resultado.setText("Ligado ");
                }else{
                    resultado.setText("Desligado ");
                }

            }
        });*/

        /*switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (switchSenha.isChecked()){
                    resultado.setText("Ligado ");
                }else{
                    resultado.setText("Desligado ");
                }

            }
        });

    }*/


    /*public void enviar(){

        if (switchSenha.isChecked()){
            resultado.setText("ligado");
        }else{
            resultado.setText("desligado");
        }

    }*/

}