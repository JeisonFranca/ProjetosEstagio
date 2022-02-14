package com.example.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView resNome;
    private TextView resEmail;
    private TextView resCor;
    private CheckBox checkVerde, checkBranco, checkVermelho;
    private RadioButton opM, opF;
    private RadioGroup opcaoSexo;
    private TextView resSexo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.nome);
        campoEmail = findViewById(R.id.email);
        resNome = findViewById(R.id.resNome);
        resEmail = findViewById(R.id.resEmail);
        resCor = findViewById(R.id.resCor);
        //
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);
        //
        opM = findViewById(R.id.radioButtonMasculino);
        opF = findViewById(R.id.radioButtonFeminino);
        resSexo = findViewById(R.id.resSexo);
        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radioButton();
    }

        public void radioButton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonMasculino){
                    resSexo.setText("Masculino");
                }else if (checkedId == R.id.radioButtonFeminino){
                    resSexo.setText("Feminino");
                }
            }
        });







        /*String sexoM = opM.getText().toString();
        String sexoF = opF.getText().toString();

        if (opM.isChecked()){
            resSexo.setText(sexoM);
        }

        if (opF.isChecked()){
            resSexo.setText(sexoF);
        }*/


        }


        public void enviar(View view){

            checkBox();
            radioButton();

                String nome = campoNome.getText().toString();
                String email = campoEmail.getText().toString();
                resNome.setText(nome);
                resEmail.setText(email);

                campoNome.setText("");
                campoEmail.setText("");

        }

    public void checkBox(){
        String texto = "";
        checkVerde.isChecked();

        if (checkVerde.isChecked()){
            String corSelecionada = checkVerde.getText().toString();
            texto = corSelecionada + " ";
        }

        if (checkBranco.isChecked()){
            String corSelecionada = checkBranco.getText().toString();
            texto = texto + corSelecionada + " ";
        }

        if (checkVermelho.isChecked()){
            String corSelecionada = checkVermelho.getText().toString();
            texto = texto + corSelecionada + " ";
        }


        resCor.setText(texto);
    }

}