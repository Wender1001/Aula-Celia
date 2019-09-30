package com.gabriel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] lista = new int[7];

        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 7; x++) {
            System.out.println("Digite um número: ");
            int num = input.nextInt();
            lista[x] = num;
        }

        for (int x = lista.length - 1; x >= 0; x--) {
            System.out.print(lista[x]);
        }
    }
}
