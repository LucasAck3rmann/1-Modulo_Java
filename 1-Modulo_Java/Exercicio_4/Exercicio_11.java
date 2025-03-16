package Exercicio_4;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado;

        if (numero % 2 == 0) {
            resultado = numero + 5;
            System.out.println("O número é par. Resultado: " + resultado);
        } else {
            resultado = numero + 8;
            System.out.println("O número é ímpar. Resultado: " + resultado);
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}
