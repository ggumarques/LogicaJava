package logicajava;

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sal�rio base do funcion�rio: R$");
        double salarioBase = scanner.nextDouble();

        double comissao = 0.05 * salarioBase;

        double salarioLiquido = salarioBase + comissao;

        System.out.println("O sal�rio l�quido do funcion�rio �: R$" + salarioLiquido);

        scanner.close();
    }
}
