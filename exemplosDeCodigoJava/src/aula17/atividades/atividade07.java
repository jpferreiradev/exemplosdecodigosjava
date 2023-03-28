package aula17.atividades;

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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





    }
}
