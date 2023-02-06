package aula15.atividades;

import java.util.Scanner;

public class questaoUM {
    public static  void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números");
        double numeroUm = scan.nextDouble();
        double numeroDois = scan.nextDouble();
        System.out.println("Os números digitados foram:" + numeroUm + " e " + numeroDois);

        if(numeroUm > numeroDois){
            System.out.println("Número 1 é maior que o 2");
        } else {
            System.out.println("Numero 2 é maior que número 1");
        }

    }
}
