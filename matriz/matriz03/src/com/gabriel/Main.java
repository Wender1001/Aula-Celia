package com.gabriel;

public class Main {

    public static void main(String[] args) {
        Matriz m = new Matriz();
        int[][] m1 = new int[3][3];

        int[][] a = m.preencherMatriz(m1);
        m.exibirSoma(a);

    }
}
