package com.example.treinamento;

class Cao extends Animal{

    void latir(){
        System.out.println("Cachorro latindo");
    }

    void dormir(){
        super.dormir();
        System.out.println("dormindo como um cachorro.");
    }
}
