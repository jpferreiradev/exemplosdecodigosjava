package aula15.atividades;

import java.util.Scanner;

public class questaoNove {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[3];

        System.out.println("Digite três números:");

        System.out.println("Primeiro número:");
        int numeroUm = scan.nextInt();
        System.out.println("Segundo número: ");
        int numeroDois = scan.nextInt();
        System.out.println("Terceiro número: ");
        int numeroTres = scan.nextInt();

        for(int i = 4;i > 0;i--){
            vetor[i] = i;
            System.out.println(i);
        }

    }
}

        /*
        for(int i = 50;i < 100;i++){
        System.out.println(i);
        }

        */

