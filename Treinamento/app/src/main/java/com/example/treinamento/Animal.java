package com.example.treinamento;

class Animal {

    int tamanho;
    String cor;
    Double peso;


    void setPeso(Double peso){
        this.peso = peso;
    }

    Double getPeso(){
        return this.peso;
    }

    void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    int getTamanho(){
        return this.tamanho;
    }



    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }


    void dormir(){

        System.out.println("Dormir como um animal");
    }

    void correr(){

        System.out.println("Correr como um animal");
    }

}
