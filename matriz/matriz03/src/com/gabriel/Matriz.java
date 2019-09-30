package com.gabriel;

import java.util.Scanner;

class Matriz {

    int[][] preencherMatriz(int[][] m) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Preencha a matriz: ");
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    void exibirSoma(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int soma = 0;
            for (int j = 0; j < m[i].length; j++) {
                soma += m[j][i];
            }
            System.out.print(soma + " ");
        }
    }

}

