package logicajava;

import java.util.Scanner;

public class AreaTrian {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do tri�ngulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do tri�ngulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A �rea do tri�ngulo �: " + area);

        scanner.close();
    }
}

