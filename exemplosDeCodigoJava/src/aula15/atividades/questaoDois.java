package aula15.atividades;

import java.util.Scanner;

public class questaoDois {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        double numero = scan.nextDouble();

        System.out.println("O número digitado foi: " + numero);

        if( numero > 0){
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        }

    }
}
