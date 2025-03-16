package Exercicio_5;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int tentativa;
        int contadorTentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            contadorTentativas++;

            if (tentativa > numeroAleatorio) {
                System.out.println("MENOR");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("MAIOR");
            } else {
                System.out.println("PARABÉNS! Você acertou em " + contadorTentativas + " tentativas.");
            }

        } while (tentativa != numeroAleatorio);

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
