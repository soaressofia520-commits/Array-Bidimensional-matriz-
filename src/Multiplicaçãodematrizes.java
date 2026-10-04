import java.util.Random;
import java.util.Scanner;

public class Multiplicaçãodematrizes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lina, linb, cola, colb;

        System.out.print("Total de linhas de A: ");
        lina = sc.nextInt();
        System.out.print("Total de colunas de A: ");
        cola = sc.nextInt();
        System.out.print("Total de colunas de B: ");
        colb = sc.nextInt();
        linb = cola;

        int[][] a = new int[lina][cola];
        int[][] b = new int[linb][colb];
        int[][] c = new int[lina][colb];

        // preenche e imprime A
        System.out.println("\nMatriz A:");
        for (int i = 0; i < lina; i++) {



            .
            for (int j = 0; j < cola; j++) {
                a[i][j] = random.nextInt(1, 10);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // preenche e imprime B
        System.out.println("\nMatriz B:");
        for (int i = 0; i < linb; i++) {
            for (int j = 0; j < colb; j++) {
                b[i][j] = random.nextInt(1, 10);
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // calcula C = A * B
        for (int i = 0; i < lina; i++) {
            for (int j = 0; j < colb; j++) {
                c[i][j] = 0;
                for (int k = 0; k < cola; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // imprime C
        System.out.println("\nMatriz C = A * B:");
        for (int i = 0; i < lina; i++) {
            for (int j = 0; j < colb; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}