import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

            //   EXERCICIO 1
//        int lista[]  = new int [7];
//
//
//
//        Scanner leitura = new Scanner(System.in);
//
//        for ( int cont = 6; cont >= 0; cont--) {
//            System.out.println("digite um numero");
//            lista[cont] = leitura.nextInt();
//        }
//
//
//        System.out.println(Arrays.toString(lista));

        //  EXERCICIO 2

//        String[] lista = new String [10];
//
//        Scanner leitura = new Scanner(System.in);
//
//        String nome;
//        boolean naoExiste = true;
//
//        for( int contador = 0;  contador < lista.length; contador ++){
//            System.out.println("DIGITE UM NOME");
//            lista[contador] = leitura.nextLine();
//        }
//
//        System.out.println("pesquise um nome ");
//        nome = leitura.nextLine();
//
//        for( int contador = 0; contador <lista.length; contador++) {
//            if (lista[contador].equals(nome)){
//                System.out.println(contador+1);
//                naoExiste = false;
//            }
//
//        }
//        if(naoExiste){
//            System.out.println("nao existe");
//        }


        double[] numero = new double[10];

        double media = 0;

        ArrayList<Double> acimaDaMedia = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);

        for(int contador = 0; contador < numero.length; contador++){
            System.out.println("digite um numero");
            numero[contador] = leitura.nextDouble();
            media+=numero[contador];
        }
        media/=numero.length;

        for(int contador = 0; contador <numero.length;contador++){
            if(numero[contador] > media){
                acimaDaMedia.add( numero[contador]);
            }

        }
        System.out.println("MEDIA :" + media);
        System.out.println("numeros acima da media" + acimaDaMedia);





}
}
