package Exercicio_5;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int QUANTIDADE_PESSOAS = 5;
        int contadorMaiores = 0;

        System.out.println("Digite a idade de " + QUANTIDADE_PESSOAS + " pessoas:");

        for (int i = 1; i <= QUANTIDADE_PESSOAS; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade > 18) {
                contadorMaiores++;
            }
        }

        System.out.println("Total de pessoas com mais de 18 anos: " + contadorMaiores);

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}
