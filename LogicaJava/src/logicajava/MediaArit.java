package logicajava;

import java.util.Scanner;

public class MediaArit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite tr�s n�meros reais para calcular a m�dia aritm�tica:");

        System.out.print("N�mero 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("N�mero 2: ");
        double numero2 = scanner.nextDouble();

        System.out.print("N�mero 3: ");
        double numero3 = scanner.nextDouble();

        double mediaAritmetica = (numero1 + numero2 + numero3) / 3;

        System.out.println("A m�dia aritm�tica dos n�meros �: " + mediaAritmetica);

        scanner.close();
    }
}
