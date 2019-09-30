package com.gabriel;

import java.util.Arrays;
import java.util.Scanner;

class Matriz {

    private final Scanner input = new Scanner(System.in);

    String[][] preencherMatriz(String[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Coloque o nome e o telefone em seguida: ");
                m[i][j] = this.input.nextLine();
            }
        }
        return m;
    }

    void exibir(String[][] m) {

        System.out.print("Quer exibir o número de quem? ");
        String nome = this.input.nextLine();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[j][i].equals(nome)){
                    System.out.println(Arrays.toString(m[i]));
                }
            }
        }

    }

}

