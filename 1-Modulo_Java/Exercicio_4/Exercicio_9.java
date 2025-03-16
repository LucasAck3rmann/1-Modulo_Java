package Exercicio_4;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("O valor de C é: " + c);

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
