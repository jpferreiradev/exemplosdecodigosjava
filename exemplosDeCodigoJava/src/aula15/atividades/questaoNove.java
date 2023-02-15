package aula15.atividades;

import java.util.Scanner;
import java.util.Vector;

public class questaoNove {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int[] numeros = new int[3];

        System.out.println("Digite três números:");

        System.out.println("Primeiro número:");
        int numeroUm = scan.nextInt();
        System.out.println("Segundo número: ");
        int numeroDois = scan.nextInt();
        System.out.println("Terceiro número: ");
        int numeroTres = scan.nextInt();

        if (numeroUm < numeroDois && numeroUm < numeroTres) {
            System.out.println("Na ordem crescente é essa:" + numeroUm + " < " + numeroDois + " < " + numeroTres);
        } else if (numeroDois < numeroUm && numeroDois < numeroTres) {
            System.out.println("Na ordem crescente é essa:" + numeroDois + " < " + numeroUm + " < " + numeroTres);
        } else if(numeroTres < numeroUm && numeroTres < numeroDois){
            System.out.println("Na ordem crescente é essa:" + numeroTres + " < " + numeroUm + " < " + numeroDois);
        }

        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("Na ordem decrescente é essa:" + numeroUm + " > " + numeroDois + " > " + numeroTres);
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            System.out.println("Na ordem decrescente é essa:" + numeroDois + " > " + numeroTres + " > " + numeroUm);
        } else if(numeroTres > numeroUm && numeroTres > numeroDois){
            System.out.println("Na ordem decrescente é essa:" + numeroTres + " > " + numeroDois + " > " + numeroUm);
        }

    }
    }


        /*
        for(int i = 50;i < 100;i++){
        System.out.println(i);
        }

        */

        // Forma certa para a questão pedida
  /*
        for(int i = 4;i > 0;i--){
            System.out.println(i);
        }
        */

 // - Ordem decresente - Maior para o menor