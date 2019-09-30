package com.gabriel;

public class Main {

    public static void main(String[] args) {

        Vetor v = new Vetor();
        v.preencherVetor();
        System.out.println(String.format("A média dos preços é de %.2f", v.media()));
        v.maior();
        v.abaixoDaMedia();
    }
}