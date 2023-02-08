package aula15.atividades;

import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        double mediaAritmetrica = (primeiraNota + segundaNota) / 2;

        System.out.println("A média foi:" + mediaAritmetrica);

        /* -> Como eu fiz
        if(mediaAritmetrica >= 7){
            System.out.println("Aprovado");
        } else if (mediaAritmetrica < 7) {
            System.out.println("Reprovado");
        } else if (mediaAritmetrica == 10) {
            System.out.println("Aprovado com distinção");
        }
        */

        // Correção da questão
        if(mediaAritmetrica == 10){
            System.out.println("Aprovado com distinção");
        } else if(mediaAritmetrica >= 7){
            System.out.println("Aprovado");
        } else if(mediaAritmetrica < 7) {
            System.out.println("Reprovado");
        }


    }
}
