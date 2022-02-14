package com.example.recicleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Model.Filme;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> lista) {

        this.listaFilmes = lista;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


            //converte o xml em view
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        //retorna o xml convertido
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Exibe a listagem

        Filme filme = listaFilmes.get(position);

        holder.titulo.setText(filme.getTituloFilme());
        holder.ano.setText(filme.getAno());
        holder.genero.setText(filme.getGenero());
    }

    @Override
    //Retorna a quantidade de itens que vão ser exibidos
    public int getItemCount() {

        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //Variáveis do MyViewHolder
        TextView titulo;
        TextView ano;
        TextView genero;

        //Método chamado na linha 22
        public MyViewHolder(View itemView){

            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);

        }
    }
}
