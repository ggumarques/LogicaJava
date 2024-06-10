package logicajava;

import java.util.Scanner;

public class OperacoesArit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois n�meros inteiros:");

        System.out.print("N�mero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("N�mero 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtra��o: " + (numero1 - numero2));
        System.out.println("Multiplica��o: " + (numero1 * numero2));
        
        if (numero2 != 0) {
            System.out.println("Divis�o: " + ((double) numero1 / numero2));
        } else {
            System.out.println("N�o � poss�vel dividir por zero.");
        }

        scanner.close();
    }
}

