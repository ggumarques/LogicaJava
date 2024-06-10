package logicajava;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro para ver a sua tabuada de multiplica��o: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplica��o de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
