package com.example.treinamento;

    /*Modificadores de acesso
    1) public -> todas as classes terão acesso
    2) private -> apenas pode ser acessado dentro da classe
    3) protected -> pode ser acessado estando dentro do mesmo pacote
    e/ou subclasses
    4)default -> Caso não tenha sido definido nenhum modificador,
    permitindo o acesso dentro do pacote

    *
    */

    public class Conta {

    private int numeroConta;
    private double saldo = 100;

    public double recuperarSaldo(){
        return this.saldo;
    }

    public void depositar(double valordepositado){
        this.saldo = this.saldo + valordepositado;
    }

    public void  sacar(double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }



}
