package logicajava;

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = scanner.nextInt();

        int auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;

        System.out.println("Ap�s a troca:");
        System.out.println("Primeiro n�mero: " + numero1);
        System.out.println("Segundo n�mero: " + numero2);

        scanner.close();
    }
}

