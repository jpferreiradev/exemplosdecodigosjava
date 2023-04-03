package javaBasico;

import java.util.Scanner;

public class TesteTres {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o seu CPF: ");
        int cpf = scan.nextInt();

        System.out.println("Seu nome é :" + nome);
        System.out.println("Seu cpf é:" + cpf);

    }
}

