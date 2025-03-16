package Exercicio_5;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Números pares até " + numero + ":");

        for (int i = 0; i <= numero; i += 2) {
            System.out.print(i + " ");

            if (i % 20 == 18 || i % 20 == 0) {
                System.out.println();
            }
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
