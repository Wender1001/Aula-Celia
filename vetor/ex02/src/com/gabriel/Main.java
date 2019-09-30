package com.gabriel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] nomes = new String[10];

        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 10; x++) {
            System.out.print("Digite um nome: ");
            String nome = input.nextLine();
            nomes[x] = nome;
        }

        System.out.print("Digite um nome qualquer: ");
        String nomeQualquer = input.nextLine();

        for (String x : nomes) {
            if (!nomeQualquer.equals(x)) {
                System.out.println("Errado");
                break;
            } else {
                System.out.println("Achou");
                break;
            }

        }

    }

}
