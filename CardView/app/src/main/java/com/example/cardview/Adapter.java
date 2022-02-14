package com.example.cardview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Postagens> postagens;

    public Adapter (List<Postagens> listaPostagem){

        this.postagens = listaPostagem;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_xml, parent, false);

        return new ViewHolder(itemLista);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Postagens postagem = postagens.get(position);

        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getMomento());
        holder.imagePostagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {

        return postagens.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

            TextView textNome;
            TextView textPostagem;
            ImageView imagePostagem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
