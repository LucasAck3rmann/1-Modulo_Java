package Exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salario = scanner.nextDouble();

        Locale localeBR = new Locale("pt", "BR");

        System.out.printf(localeBR, "Seu salário é: R$ %.2f%n", salario);

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}
