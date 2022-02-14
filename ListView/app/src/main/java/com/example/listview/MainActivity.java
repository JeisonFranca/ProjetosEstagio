package com.example.listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaNumeros;
    private String[] coisas = {
            "1","2","3","4","5","6"
            ,"7","8","9","10","11","12"
            ,"13","14","15","16","17","18"
            ,"19","20","21","22","23","24"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaNumeros = findViewById(R.id.listView);

        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                coisas
        );

        listaNumeros.setAdapter(adaptador);

        listaNumeros.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado = listaNumeros.getItemAtPosition(position).toString();


                Toast.makeText(getApplicationContext(), valorSelecionado, Toast.LENGTH_SHORT).show();

            }

        });




    }

}