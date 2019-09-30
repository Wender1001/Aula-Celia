package com.gabriel;

import java.util.*;

class Vetor {

    private final Scanner input = new Scanner(System.in);
    private String[] modelos = new String[5];
    private Double[] precos = new Double[5];

    void preencherVetor() {
        for (int i = 0; i < this.modelos.length; i++) {
            System.out.print("Informe o modelo: ");
            this.modelos[i] = this.input.next();
            System.out.print("Informe o preço: ");
            this.precos[i] = this.input.nextDouble();
        }

        for (int i = 0; i < this.modelos.length; i++) {
            System.out.println(String.format("Modelo: %s \t Preço: R$%.2f", this.modelos[i], this.precos[i]));
        }

    }

    double media() {
        return Arrays.stream(this.precos).reduce((double) 0, Double::sum) / precos.length;
    }

    void maior() {
        double maior = 0;
        for (Double x : this.precos) {

            if (x > maior) {
                maior = x;
            }
        }
        System.out.println(String.format("O modelo mais caro é o %s custando R$%.2f", modelos[Arrays.asList(this.precos).indexOf(maior)], maior));
    }

    void abaixoDaMedia() {
        System.out.println("Os modelos que estão abaixo da média são:");
        for (Double x : this.precos) {
            if (x < media()) {
                System.out.println(String.format("%s \t R$%.2f", this.modelos[Arrays.asList(this.precos).indexOf(x)], x));
            }
        }
    }

}




