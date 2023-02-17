package aula15.atividades;

import java.util.Scanner;

public class questaoDez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = scan.nextLine();
        System.out.println("Informe o turno que você estuda, digite M, V ou N ");
        String turno = scan.nextLine();

        /* - Fiz dessa forma!
        switch (turno) {
            case "m":
                System.out.println("Bom dia, " + nome);
                break;
            case "M":
                System.out.println("Bom dia," + nome);
                break;
            case "V":
                System.out.println("Boa tarde," + nome);
                break;
            case "v":
                System.out.println("Boa tarde, " + nome);
                break;
            case "N":
                System.out.println("Boa noite," + nome);
                break;
            case "n":
                System.out.println("Boa noite, " + nome);
                break;
            default:
                System.out.println("Valor inválido, informe novamente.");
                break;
        }
        */

        // Forma menos verbosa e mais certa
        switch (turno) {
            case "m":
            case "M":
                System.out.println("Bom dia," + nome);
                break;

            case "v":
            case "V":
                System.out.println("Boa tarde," + nome);
                break;

            case "n":
            case "N":
                System.out.println("Boa noite," + nome);
                break;

            default:
                System.out.println("Valor inválido, informe novamente.");
        }


    }
}
