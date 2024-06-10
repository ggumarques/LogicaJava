package logicajava;

import java.util.Scanner;

public class Idoso {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inv�lida.");
        } else if (idade < 12) {
            System.out.println("A pessoa � uma crian�a.");
        } else if (idade < 18) {
            System.out.println("A pessoa � um adolescente.");
        } else if (idade < 60) {
            System.out.println("A pessoa � um adulto.");
        } else {
            System.out.println("A pessoa � um idoso.");
        }

        scanner.close();
    }
}
