package Exercicio_4;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado;

        if (numero > 0) {
            resultado = numero * 2;
            System.out.println("O dobro de " + numero + " é: " + resultado);
        } else {
            resultado = numero * 3;
            System.out.println("O triplo de " + numero + " é: " + resultado);
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
