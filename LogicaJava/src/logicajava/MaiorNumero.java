package logicajava;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero inteiro: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o segundo n�mero inteiro: ");
		int numero2 = scanner.nextInt();

		int maiorNumero = numero1 > numero2 ? numero1 : numero2;

		System.out.println("O maior n�mero �: " + maiorNumero);

		scanner.close();
	}
}
