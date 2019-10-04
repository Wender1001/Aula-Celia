import java.util.Scanner;

public class Provinha3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int maxFun ;

         do{
             System.out.println("quantos funcionarios(maior ou igual a 3 menor ou igual a 25) ? ");
             maxFun = leitor.nextInt();

         }while(maxFun <3 | maxFun>25);


            int meses;
             String [] mes = new String[]{"JANEIRO","FEVEREIRO","MARÇO"};
            String [] funcionario = new String [maxFun];
            double ganho [][] = new double[maxFun][3];
            double total[] = new double[maxFun];




        for (int contador = 0; contador <funcionario.length; contador++){
                System.out.println("nome do " +(contador +1)+ "°"+" funcionario : ");
                funcionario[contador] =leitor.next();
            }

        for (int linha=0; linha < ganho.length; linha++) {
            for (int coluna = 0; coluna < ganho[0].length; coluna++) {
                    System.out.println("Digite o ganho do mês de " +mes[coluna] +
                            " do funcionario " + funcionario[linha]);
                    ganho[linha][coluna] = leitor.nextDouble();
                }
            }
            for (int linha=0; linha < ganho.length; linha++) {
                double soma = 0;
                for (int coluna=0; coluna < ganho.length; coluna++) {
                    soma += ganho[linha][coluna];
                }
                total[linha]+= soma ;

            }

        System.out.printf("%-25s%10s%10s%10s%10s\n", "Nome do funcionario",
                "JANEIRO", "FEVEREIRO","MARÇO","TOTAL");
        for (int linha=0; linha < ganho.length; linha++) {
            System.out.printf("%-25s",funcionario[linha]);
            for (int coluna=0; coluna < ganho[0].length; coluna++) {
                System.out.printf("%10.2f",ganho[linha][coluna]);
            }
            System.out.printf("%10.2f",total[linha]);
            System.out.println();
        }






        }
}
