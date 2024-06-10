package logicajava;

import java.util.Scanner;

public class DiaMes {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome do m�s em letras minusculas: ");
		String mes = scanner.nextLine();

		int dias;
		switch (mes) {
		case "janeiro":
		case "mar�o":
		case "maio":
		case "julho":
		case "agosto":
		case "outubro":
		case "dezembro":
			dias = 31;
			break;
		case "abril":
		case "junho":
		case "setembro":
		case "novembro":
			dias = 30;
			break;
		case "fevereiro":
			dias = 28;
			break;
		default:
			dias = -1;
		}

		if (dias != -1) {
			System.out.println("O m�s de " + mes + " possui " + dias + " dias.");
		} else {
			System.out.println("M�s inv�lido.");
		}

		scanner.close();
	}
}
