package todasAtividadesDaCarreira;

import java.util.Scanner;

public class questaoSeis {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double valorRaio = scan.nextDouble();

        //double p12 = Math.PI * Math.pow(valorRaio,2);
        double pi = 3.14;
        double valorDoRaio = valorRaio * valorRaio;

        double conversaoFormula = pi * valorDoRaio;

        System.out.println(conversaoFormula);






    }

}
