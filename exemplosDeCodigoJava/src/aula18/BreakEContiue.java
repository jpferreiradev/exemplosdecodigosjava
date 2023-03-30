package aula18;

import java.util.Scanner;

public class BreakEContiue {
    public static void main(String[] args) {

        //Exemplo de break;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        System.out.println("Digite um limite: ");
        int max = scan.nextInt();

        // Exemplo de um break para sair de um for
        for (int i = numero; i <= max; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("O valor de i é:" + i);
                    break;
            }
        }

    }


}
