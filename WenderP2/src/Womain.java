import java.util.Arrays;

public class Womain {
    public static void main(String[] args) {

        Matriz m = new Matriz();

        m.numeroMatriz();

        int [][] matriz1 = new int [m.numero][m.numero];

       int [] [] a =  m.preencheMatriz(matriz1);

        m.exibeMatriz(matriz1);

        m.valorIndice();
        m.contaImparesColuna(matriz1,m.numeroIndice);
        m.valorIndice();
        m.somaParesLinha(matriz1,m.numeroIndice);



        }

    }

