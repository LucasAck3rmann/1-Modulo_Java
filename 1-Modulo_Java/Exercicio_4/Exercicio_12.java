package Exercicio_4;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int c = scanner.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("Por favor, digite três valores diferentes.");
            return;
        }

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("Ordem decrescente: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Ordem decrescente: " + a + ", " + c + ", " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("Ordem decrescente: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Ordem decrescente: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a > b) {
                System.out.println("Ordem decrescente: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Ordem decrescente: " + c + ", " + b + ", " + a);
            }
        }
        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
