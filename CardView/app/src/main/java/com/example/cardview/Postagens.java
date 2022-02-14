package com.example.cardview;

import android.widget.ImageView;

public class Postagens {
    String nome;
    String momento;
    int imagem;

    public Postagens() {
    }

    public Postagens(String nome, String momento, int imagem) {
        this.nome = nome;
        this.momento = momento;
        this.imagem = imagem;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getMomento() { return momento; }

    public void setMomento(String momento) { this.momento = momento; }

    public int getImagem() { return imagem; }

    public void setImagem(int imagem) { this.imagem = imagem; }
}

