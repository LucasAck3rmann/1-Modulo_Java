package Exercicio_2;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        System.out.println();
        System.out.printf("%.2f + %.2f = %.2f.%n", numero1, numero2, soma);

        System.out.println("Operação concluída com sucesso!");
        System.exit(0);
    }
}
