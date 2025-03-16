package Exercicio_2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Agora, informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println();
        System.out.printf("Olá, %s! Você tem %d anos.%n", nome, idade);

        System.out.println("Foi um prazer conhecer você!");

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}

