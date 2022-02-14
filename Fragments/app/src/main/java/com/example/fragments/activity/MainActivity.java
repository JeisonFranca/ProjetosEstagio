package com.example.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.R;
import com.example.fragments.fragment.ContatosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversas;
    private Button buttonContatos;
    private ContatosFragment contatosFragment;
    private ConversasFragment conversasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //REMOVER SOMBRA DA ACTIVITYBAR
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();

        //CONFIGURAR OBJETO PARA FRAGMENTO

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment, conversasFragment);
        transaction.commit();

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment, contatosFragment);
                transaction.commit();

            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment, conversasFragment);
                transaction.commit();

            }
        });

    }
}