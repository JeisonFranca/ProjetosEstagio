package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagens> listaPostagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        this.prepararPostagens();

        Adapter adapter = new Adapter(listaPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setAdapter(adapter);
        recyclerPostagem.setHasFixedSize(true);

        //Define Adapter


    }

    public void prepararPostagens(){

        Postagens p = new Postagens("Jeison","bom", R.drawable.imagem1);
        this.listaPostagem.add(p);

        p = new Postagens("Thamires","legal", R.drawable.imagem2);
        this.listaPostagem.add(p);

        p = new Postagens("Jessica","demais", R.drawable.imagem3);
        this.listaPostagem.add(p);

        p = new Postagens("Ingridi","show", R.drawable.imagem4);
        this.listaPostagem.add(p);



    }
}