package aula15.atividades;

import java.util.Scanner;

public class questaoSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite o terceiro número");
        int terceiroNumero = scan.nextInt();

        System.out.println("Os números digitados foram: " + primeiroNumero + segundoNumero + terceiroNumero);

        if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println("");
        }
    }
}
