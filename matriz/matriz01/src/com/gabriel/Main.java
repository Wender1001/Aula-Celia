package com.gabriel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[][] m1 = new int[2][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("Preencha a matriz: ");
                m1[i][j] = input.nextInt();
            }
        }

        for (int[] x : m1) {
            for (int z : x) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        
    }
}
