package aula17.atividades;

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        //int maior2 = Integer.

        for(int i = 0;i < 5;i++){
            System.out.println("Entre com um número:");
            num = scan.nextInt();

            if(num > maior){
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }
            System.out.println("O maior número digitado foi: " + maior);
        }




        /*
        int primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, quintoNumero;

        System.out.println("Informe 5 números:");
        System.out.println("Primeiro número:");
        primeiroNumero = scan.nextInt();
        System.out.println("Segundo número:");
        segundoNumero = scan.nextInt();
        System.out.println("Terceiro número:");
        terceiroNumero = scan.nextInt();
        System.out.println("Quarto número:");
        quartoNumero = scan.nextInt();
        System.out.println("Quinto número:");
        quintoNumero = scan.nextInt();

        System.out.println("Os números foram: " + primeiroNumero + " - " + segundoNumero + " - " + terceiroNumero + " - " + quartoNumero + " - " + quintoNumero);
        */




    }
}
