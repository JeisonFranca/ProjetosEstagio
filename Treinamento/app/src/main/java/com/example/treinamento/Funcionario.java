package com.example.treinamento;

class Funcionario {

    //Propriedade
        String nome;
        double salario;

    //Método
        /*
        Sem Retorno
        void recuperarSalario(){
        */

        /*Com Retorno*/
        Double recuperarSalario(double bonus, double desconto){

            this.salario = this.salario - (this.salario * 0.1);

            return this.salario + bonus - desconto;

        }
}
