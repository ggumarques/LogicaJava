package logicajava;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um n�mero inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par.");
		} else {
			System.out.println("O n�mero " + numero + " � �mpar.");
		}

		scanner.close();
	}
}
