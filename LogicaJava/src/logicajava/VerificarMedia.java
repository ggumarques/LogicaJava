package logicajava;

import java.util.Scanner;

public class VerificarMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro n�mero:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo n�mero:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro n�mero:");
        int numero3 = scanner.nextInt();

        double media = (numero1 + numero2 + numero3) / 3.0;

        System.out.println("A m�dia aritm�tica �: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
