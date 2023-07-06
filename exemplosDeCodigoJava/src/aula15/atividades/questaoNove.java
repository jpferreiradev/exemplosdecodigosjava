package aula15.atividades;

import java.util.Scanner;
import java.util.Vector;

public class questaoNove {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite três números:");

        System.out.println("Primeiro número:");
        int numeroUm = scan.nextInt();
        System.out.println("Segundo número: ");
        int numeroDois = scan.nextInt();
        System.out.println("Terceiro número: ");
        int numeroTres = scan.nextInt();


        /* - Como você fez:
        if (numeroUm <= numeroDois && numeroUm <= numeroTres) {
            System.out.println("Na ordem crescente é essa:" + numeroUm + " < " + numeroDois + " < " + numeroTres);
        } else if (numeroDois <= numeroUm && numeroDois <= numeroTres) {
            System.out.println("Na ordem crescente é essa:" + numeroDois + " < " + numeroTres + " < " + numeroUm);
        } else if(numeroTres <= numeroUm && numeroTres <= numeroDois){
            System.out.println("Na ordem crescente é essa:" + numeroTres + " < " + numeroDois + " < " + numeroUm);
        }
        */

        // Como foi feita na questão, essa eu não entendi.

        if(numeroUm <= numeroDois && numeroUm <= numeroTres && numeroDois <= numeroTres){
            // numero 1 é menor
            // numero 3 é maior
            // num1 < num2 < num3
            System.out.println(numeroTres + " < " + numeroDois + "<" + numeroUm);
        } else if (numeroUm <= numeroDois && numeroUm <= numeroTres && numeroTres <= numeroDois) {
            // num1 é menor
            // num2 é maior
            // num1 < num 3 < num2
            System.out.println(numeroDois + " < " + numeroTres + " < " + numeroUm);
        } else if (numeroDois <= numeroUm && numeroDois <= numeroTres && numeroUm <= numeroDois) {
            // num2 é menor
            // num 3 é maior
            // num2 < num 1 < num3
            System.out.println(numeroTres + " - " + numeroUm + "-" + numeroDois);
        } else if (numeroDois <= numeroUm && numeroDois <= numeroTres && numeroTres <= numeroUm) {
            // num 2 é menor
            // num 1 é maior
            // num2 < num 3 < num 1
            
        } else if (numeroTres <= numeroUm && numeroTres <= numeroDois && numeroUm <= numeroDois ) {
            // num3 é menor
            // num2 é maior
            // num3 < num 1 < num 2
            System.out.println(numeroDois + " < " + numeroUm + " < " + numeroTres );
        } else if (numeroTres <= numeroUm && numeroTres <= numeroDois && numeroDois <= numeroUm) {
            // num 3 é menor
            // num1 é maior
            // num3 < num2 < num1
            System.out.println(numeroUm + " < " + numeroDois + " < " + numeroTres);
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
// - Ordem crescente - Menor para o maior

/* if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("Na ordem decrescente é essa:" + numeroUm + " > " + numeroDois + " > " + numeroTres);
        } else if (numeroDois > numeroUm && numeroDois > numeroTres) {
            System.out.println("Na ordem decrescente é essa:" + numeroDois + " > " + numeroUm + " > " + numeroTres);
        } else if(numeroTres > numeroUm && numeroTres > numeroDois){
            System.out.println("Na ordem decrescente é essa:" + numeroTres + " > " + numeroUm + " > " + numeroDois);
        }


 */