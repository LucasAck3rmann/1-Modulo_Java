package Exercicio_4;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        scanner.nextLine();

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine().toUpperCase();

        if (sexo == 'F' && estadoCivil.equals("CASADA")) {
            System.out.print("Digite o tempo de casada (em anos): ");
            int tempoCasada = scanner.nextInt();
            System.out.println("Nome: " + nome);
            System.out.println("Tempo de casamento: " + tempoCasada + " anos");
        } else {
            System.out.println("Nome: " + nome);
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }
}
