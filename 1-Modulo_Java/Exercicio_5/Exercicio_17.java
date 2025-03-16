package Exercicio_5;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        // Validação para aceitar apenas números entre 1 e 10
        do {
            System.out.print("Digite um número de 1 a 10: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Valor inválido! Digite um número entre 1 e 10.");
            }
        } while (numero < 1 || numero > 10);

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}