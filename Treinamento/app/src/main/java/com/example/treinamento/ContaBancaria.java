package com.example.treinamento;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(){
        System.out.println("Construtor");
    }

    public ContaBancaria(String nome){
        System.out.println("Construtor com nome: " + nome);
    }
}
