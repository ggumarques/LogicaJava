
package logicajavaptdois;

import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int soma = 0;
        
        System.out.println("Digite os elementos da matriz 4x4:");
        
        // Loop para ler os elementos da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j]; // Adiciona cada elemento � soma
            }
        }
        
        double media = (double) soma / (4 * 4); // Calcula a m�dia
        
        System.out.println("Matriz digitada:");
        
        // Loop para exibir a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a pr�xima linha ap�s cada linha da matriz
        }
        
        System.out.println("A m�dia aritm�tica dos elementos da matriz �: " + media);
        
        scanner.close();
    }
}

