package logicajava;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O n�mero � positivo.");
        } else if (numero < 0) {
            System.out.println("O n�mero � negativo.");
        } else {
            System.out.println("O n�mero � zero.");
        }

        scanner.close();
    }
}

