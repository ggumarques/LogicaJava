package logicajava;

import java.util.Scanner;

public class AreaCirc {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do c�rculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        double perimetro = 2 * Math.PI * raio;

        System.out.println("�rea do c�rculo: " + area);
        System.out.println("Per�metro do c�rculo: " + perimetro);

        scanner.close();
    }
}
