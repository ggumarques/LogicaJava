package logicajavaptdois;

import java.util.Scanner;

public class Ex73{
    public static void main(String[] args) {
    	//Escreva um programa que leia um n�mero inteiro e exiba a sequ�ncia de Fibonacci at� o n�mero lido.
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Sequ�ncia de Fibonacci at� " + numero + ":");
        for (int i = 0; fibonacci(i) <= numero; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        scanner.close();
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


