package logicajava;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = scanner.nextInt();

        boolean ehMultiplo = numero1 % numero2 == 0;

        if (ehMultiplo) {
            System.out.println(numero1 + " � m�ltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " n�o � m�ltiplo de " + numero2);
        }

        scanner.close();
    }
}

