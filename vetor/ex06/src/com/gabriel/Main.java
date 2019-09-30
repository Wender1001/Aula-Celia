package com.gabriel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] carros = new String[5];
        double[] consumos = new double[5];
        double minimo = 0;
        double consumoMinimo = 0;

        for (int x = 0; x < carros.length; x++) {
            System.out.print("Digite um modelo de carro: ");
            String modelo = input.nextLine();
            carros[x] = modelo;
        }

        for (int x = 0; x < consumos.length; x++) {
            System.out.print("Informe o consumo de cada carro: ");
            double consumo = input.nextDouble();
            consumos[x] = consumo;
        }

        for (double x : consumos) {
            minimo = x;
            consumoMinimo = Math.min(x, minimo);
        }

        int menorConsumo = Arrays.asList(consumos).indexOf(consumoMinimo);

        System.out.println("O carro com o menor consumo é o : " + carros[menorConsumo]);
    }
}
