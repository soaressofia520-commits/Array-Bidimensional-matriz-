import java.util.Random;

public class Maiorvaloresuaposição {
    static void main() {

        Random random = new Random();
        int[][] m = new int[3][3];
        int maior = Integer.MIN_VALUE; // maior = 0
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = random.nextInt(0, 30);
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
                else {
                   menor = m[i][j];
                }
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nmaior = " + maior);
        System.out.println("menor = " + menor);

        // imprimir a localização do maior valor
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == maior) {
                    System.out.println("\nlinha = " + (i + 1) + ", coluna = " + (j + 1));
                }
            }
        }
    }
}

