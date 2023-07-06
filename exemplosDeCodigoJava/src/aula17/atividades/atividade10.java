package aula17.atividades;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        System.out.println("Digite o número um :");
        int numeroUm = scan.nextInt();
        System.out.println("Digite o número dois: ");
        int numeroDois = scan.nextInt();
        System.out.println(" Os números interiors foram: " + numeroUm + " e " + numeroDois);


        for(int i = numeroUm; i < numeroDois;i++ ){
            System.out.println(i);
        }




    }
}
