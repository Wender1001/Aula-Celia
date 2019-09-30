package com.gabriel;

import java.util.Scanner;

class Matriz {

    int[][] preencheMatriz(int[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Preencha a matriz: ");
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    void exibeMatriz(int[][] m) {
        for (int[] x : m) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    int somaMatriz(int[][] m) {
        int cont = 0;
        for (int[] x : m) {
            for (int y : x) {
                cont += y;
            }
        }
        return cont;
    }

    int[][] preencheMatrizSoma(int m1, int m2) {
        return new int[][]{{m1, m2}};

    }
}
