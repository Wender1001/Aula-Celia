package com.gabriel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < 10; x++) {
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            numeros[x] = num;
        }
        int media = Arrays.stream(numeros).reduce(0, (x, y) -> x + y) / numeros.length;
        System.out.println(String.format("A média é: %d", media));


    }

}
