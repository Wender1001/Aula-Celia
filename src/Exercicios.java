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
        //  EXERCICIO 3
//        double[] numero = new double[10];
//
//        double media = 0;
//
//        ArrayList<Double> acimaDaMedia = new ArrayList<>();
//
//        Scanner leitura = new Scanner(System.in);
//
//        for(int contador = 0; contador < numero.length; contador++){
//            System.out.println("digite um numero");
//            numero[contador] = leitura.nextDouble();
//            media+=numero[contador];
//        }
//        media/=numero.length;
//
//        for(int contador = 0; contador <numero.length;contador++){
//            if(numero[contador] > media){
//                acimaDaMedia.add( numero[contador]);
//            }
//
//        }
//        System.out.println("MEDIA :" + media);
//        System.out.println("numeros acima da media" + acimaDaMedia);
//
        // EXERCICIO 4

//        int dia = 0;
//        int mes = 0;
//
//
//        int total = 0;
//
//        int[] mounth = {31,28,30,31,30,31,30,31,30,31,30,31};
//
//        Scanner diaDoAno = new Scanner(System.in);
//
//
//
//        System.out.println("digite um dia de 1 á 31");
//        dia = diaDoAno.nextInt();
//        System.out.println(dia);
//
//        Scanner mesDoAno = new Scanner(System.in);
//
//
//        System.out.println("digite um mes de 1 á 12");
//        mes = mesDoAno.nextInt();
//        System.out.println(mes);
//
//
//        if(mes == 1){
//            System.out.println(dia);
//        }else{
//
//
//
//
//           for(int contador = 0; contador <=mes; contador++){
//
//               int cont = mes-1;
//            if(mes == contador){
//            total += dia;
//            }else{
//                total +=mounth[contador];
//            }

        //EXERCICIO 5
//        int c =0;
//        int valor;
//        int valorRepetido;
//        int[] valores = new int[10];
//        int acao;
//
//        Scanner numero = new Scanner(System.in);
//        Scanner numeroRepetido = new Scanner(System.in);
//
//        for (int contador = 0; contador < valores.length; contador++) {
//            System.out.println("digite um numero");
//            valor = numero.nextInt();
//            valores[contador] = valor;
//
//        }
//
//        do{
//            System.out.println("digite um numero para validação");
//            valorRepetido = numeroRepetido.nextInt();
//
//            for (int i : valores) {
//                if (valorRepetido == i) {
//
//                    c++;
//
//                }
//
//            }
//            System.out.println("o numero : " + valorRepetido + " ocorre " + c + " vezes");
//            System.out.println("oque deseja fazer ? 1-continuar; 2-sair");
//            acao = numero.nextInt();
//
//            c = 0;
//
//        } while (acao == 1);
//
//        System.out.println("Saindoooo");
//        System.exit(200);

        String[] modelo =  new String[5];
        int[] consumo = new int[5];
        String carroEconomico;
        int consumoEconomico;
      //  String[] economico = new String[2];

        Scanner modeloCarro = new Scanner(System.in);
        Scanner consumoCarro = new Scanner(System.in);

        for(int contador = 0; contador <modelo.length; contador++){
            System.out.println("modelo do carro : ");
            modelo[contador] = modeloCarro.nextLine();

        }

        for(int contador = 0; contador<consumo.length; contador++){
            System.out.println("consumo do carro : ");
            consumo[contador] = consumoCarro.nextInt();
        }

        for()

    }
}
