package Exercicio_4;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR");
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
