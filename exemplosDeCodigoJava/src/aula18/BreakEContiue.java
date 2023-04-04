package aula18;

import java.util.Scanner;

public class BreakEContiue {
    public static void main(String[] args) {

    // Aqui é o exemplo que o break é usado em sua grande maioria
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Digite um limite: ");
        int limite = scan.nextInt();

        for(int i = num; i<= limite; i++){
            System.out.println(i);
            // i / 7, o resto é preciso dar 0
            if(i % 7 == 0){
                System.out.println("O valor de i é:" + i);
                //break;

            }
        }

    }


}

// Utilizando para sair do loop: while/do while ou for
/*

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


 */