package aula17.atividades;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroUm;
        int numeroDois;


        System.out.println("Digite dois números inteiros:");
        System.out.println("Digite o número um :");
        numeroUm = scan.nextInt();
        System.out.println("Digite o número dois: ");
        numeroDois = scan.nextInt();
        System.out.println(" Os números interiors foram: " + numeroUm + " e " + numeroDois);
        int somaDosNumeros = numeroUm + numeroDois;

        for (int i = numeroUm; i < numeroDois; i++) {
            System.out.println(i);

        }

        System.out.println("A soma dos numero inteiros é: " + somaDosNumeros);

    }
}
