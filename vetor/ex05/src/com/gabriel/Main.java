package com.gabriel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        int[] numeros = new int[2];

        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Digite um número: ");
            int numero = input.nextInt();
            numeros[x] = numero;
        }

        System.out.println("Pesquise um número: ");
        int numeroQualquer = input.nextInt();

        for (int x : numeros) {
            if (x == numeroQualquer) {
                cont++;
            }
        }

        System.out.println(String.format("O número %d apareceu %d vez(es)", numeroQualquer, cont));
    }
}
