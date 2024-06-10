package logicajavaptdois;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		//Fa�a um programa que leia um n�mero inteiro e exiba se ele � um n�mero primo.

		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();
        
        boolean primo = verificarPrimo(numero);
        
        if (primo) {
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }
        
        scanner.close();
	}

public static boolean verificarPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    
    return true;
}
}
