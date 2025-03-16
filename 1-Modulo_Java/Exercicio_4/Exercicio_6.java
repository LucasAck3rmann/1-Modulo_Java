package Exercicio_4;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        if (a + b < c) {
            System.out.println("A soma de A + B é menor que C");
        } else {
            System.out.println("A soma de A + B NÃO é menor que C");
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}
