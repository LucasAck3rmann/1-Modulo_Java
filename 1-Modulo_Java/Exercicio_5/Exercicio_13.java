package Exercicio_5;

public class Exercicio_13 {
    public static void main(String[] args) {
        System.out.println("Números pares de 0 a 100:");

        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");

            if (i % 20 == 0 && i > 0) {
                System.out.println();
            }
        }

        System.out.print("Code by Lucas Ackermann");
        System.exit(0);
    }

}
