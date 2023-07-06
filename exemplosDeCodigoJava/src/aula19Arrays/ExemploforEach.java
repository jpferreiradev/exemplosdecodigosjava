package aula19Arrays;

import java.util.Scanner;

public class ExemploforEach {
    public static void main(String[] args) {

        int[] numero = new int[5];
        int soma = 0;

        Scanner scan = new Scanner(System.in);

        for(int cont = 0; cont < numero.length ; cont++) {
            System.out.println("Entre com o número" + (cont + 1) + ":");
            numero[cont] = scan.nextInt();
        }

        for( int cont : numero){
            soma += cont;
        }
        System.out.println("A soma dos números que você digitou é: " + soma);
    }

}
