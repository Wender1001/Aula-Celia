package com.gabriel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Matriz m = new Matriz();
        int[][] m1 = new int[2][3];
        int[][] m2 = new int[2][3];

        int[][] a = m.preencheMatriz(m1);
        m.exibeMatriz(a);

        int[][] b = m.preencheMatriz(m2);
        m.exibeMatriz(b);

        int soma1 = m.somaMatriz(a);
        int soma2 = m.somaMatriz(b);

        System.out.println(Arrays.deepToString(m.preencheMatrizSoma(soma1, soma2)));

    }
}
