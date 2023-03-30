package aula18;

import java.util.Scanner;

public class BreakContinue3 {
    public static void main(String[] args) {

        // Exemplo de continue

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        System.out.println("Digite um limite:");
        int limitemax = scan.nextInt();

        for (int i = numero; i <= limitemax; i++) {
            if (i % 7 == 0) {
                continue; // Se o número for multiplo de 7, ele pedi pra continuar;
            }
            System.out.println("O valor de i é:" + i);
        }
    }
}
