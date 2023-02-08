package aula15.atividades;

import java.util.Scanner;

public class questaoDez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = scan.nextLine();
        System.out.println("Informe o turno que você estuda, digite M, V ou N ");
        String turno = scan.nextLine();

        switch (turno){
            case "m":
                System.out.println("Bom dia, " + nome);
                break;
            case "v":
                System.out.println("Boa tarde, " + nome);
                break;
            case "n":
                System.out.println("Boa noite, " + nome);
                break;
            default:
                System.out.println("Valor inválido, informe novamente.");
                break;
        }

    }
}
