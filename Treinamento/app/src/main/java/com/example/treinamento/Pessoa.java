package com.example.treinamento;

public class Pessoa {
    String nome;
    int idade;

    public void exibirDados(String nome, int idade){
        System.out.println("Seu nome é: " + nome);
        System.out.println("E tem " + idade + " anos de idade");
    }

    public void exibirDados(String nome){
        System.out.println("Seu nome é: " + nome);
    }
}
