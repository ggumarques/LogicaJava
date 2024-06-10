package logicajavaptdois;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		
		/*Escreva um programa que calcule o fatorial de um n�mero inteiro inserido pelo usu�rio usando o loop "do-while".*/
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Digite um n�mero inteiro positivo: ");
			num = scanner.nextInt();
			if(num < 0) {
				System.out.println("N�mero inv�lido. Por favor, insira um n�mero positivo.");
			}
		} while(num < 0);
		
		long fatorial = 1;
		int i = 1;
		
		do {
			fatorial *= i;
			i++;
		}while (i <= num);
		System.out.println("O fatorial de " + num + " � " + fatorial);
		
		scanner.close();
	}
	
	

}
