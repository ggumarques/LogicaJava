package logicajava;

import java.util.Scanner;

public class BonusSalar {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o sal�rio do funcion�rio: R$");
		double salario = scanner.nextDouble();

		double bonus;
		if (salario > 2000) {
			bonus = salario * 0.10;
			bonus = salario * 0.05;
		}

		System.out.println("O valor do b�nus do funcion�rio �: R$" + bonus);

		scanner.close();
	}
}
