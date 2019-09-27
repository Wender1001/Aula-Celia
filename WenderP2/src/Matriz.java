import java.util.Scanner;

public class Matriz {

    int numero = 0;
    int numeroIndice = 0;
    int numeroPar;
    int numeroImpar;

    public void numeroMatriz() {

        Scanner n = new Scanner(System.in);

        do {
            System.out.println("digite um numero maior ou igual a 4 : ");
            numero = n.nextInt();

        } while (numero < 4);
    }

    public int[][] preencheMatriz(int[][] m) {

        Scanner n = new Scanner(System.in);

        for (int contLinha = 0; contLinha < m.length; contLinha++) {
            for (int contColuna = 0; contColuna < m[0].length; contColuna++) {
                System.out.println("digite os numeros para matriz : " + " [" + contLinha + "]" + "{" + contColuna + "]");
                m[contLinha][contColuna] = n.nextInt();
            }
        }
        return m;
    }

    public void valorIndice() {

        Scanner n = new Scanner(System.in);

        do {

            System.out.println("digite um numero do indice  : ");
            numeroIndice = n.nextInt();

        } while (numeroIndice < 0 || numeroIndice > numero);

    }

    public int[][] exibeLinha(int[][] m) {

        for (int coluna = 0; coluna < m.length; coluna++) {
            System.out.println(m[numeroIndice][coluna] + "\t");
        }
        System.out.println();

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

    public void contaImparesColuna(int[][] m,int n) {
            for (int coluna = 0; coluna < m[0].length; coluna++) {
               n = m[coluna][numeroIndice];
                if (n % 2 != 0) {
                    numeroImpar++;

                }
            }

        System.out.println("numero de impares na coluna " + numeroIndice + " : " + numeroImpar + "\n");
    }

    public void somaParesLinha(int[][] m,int n) {
        for (int linha = 0; linha < m.length; linha++) {
                n = m[numeroIndice][linha];
                if (n % 2 == 0) {
                    numeroPar += n;
                }
            }
        System.out.println("soma dos pares na linha " + numeroIndice + " : " + numeroPar  );
        }

    }

