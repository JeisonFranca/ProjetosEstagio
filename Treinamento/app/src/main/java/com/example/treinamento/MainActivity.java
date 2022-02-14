package com.example.treinamento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Jeison jeison = new Jeison();
        jeison.ganharEleicao();
        Obama obama = new Obama();
        obama.ganharEleicao();








        /*ContaBancaria conta = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria("Jeison");*/



        /*Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Jeison",28);
        pessoa.exibirDados("Maria");*/




       /* Conta conta = new Conta();
        conta.depositar(100);// 200
        conta.sacar(50);// 150

        System.out.println(conta.recuperarSaldo());*/




       /* Cao cao = new Cao();

        cao.dormir();*/

        /*cao.setCor("Azul");
        System.out.println(cao.getCor());

        *//*-------------------------------------------------*//*

        cao.setTamanho(23);
        System.out.println(cao.getTamanho());

        *//*-------------------------------------------------*//*

        cao.setPeso(98.7);
        System.out.println(cao.getPeso());

        /*****************************************************//*

        Passaro passaro = new Passaro();

        passaro.setCor("colorido");
        System.out.println(passaro.getCor());

        *//*-------------------------------------------------*//*

        passaro.setTamanho(30);
        System.out.println(passaro.getTamanho());

        *//*-------------------------------------------------*//*

        passaro.setPeso(10.0);
        System.out.println(passaro.getPeso()+"KG");
        System.out.println("E está ");
        passaro.voar();*/

        /*-------------------------------------------------*/



        /****************************************************/

        /*Animal animal = new Animal();
        animal.correr();*/

        /*Passaro passaro = new Passaro();
        passaro.dormir();
        passaro.correr();*/

        /*Cao cao = new Cao();

        cao.latir();
        cao.dormir();
        /*--------------------------------------
        passaro.voar();
        passaro.dormir();*/



/******************************************************/

        /*Funcionario funcionario = new Funcionario();
        funcionario.nome = "Jeison";
        funcionario.salario = 920;

        double salarioRecuperado = funcionario.recuperarSalario(150,20);

        System.out.println("Meu Salário é: " + salarioRecuperado);*/

        /*Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";
        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();*/
    }
}