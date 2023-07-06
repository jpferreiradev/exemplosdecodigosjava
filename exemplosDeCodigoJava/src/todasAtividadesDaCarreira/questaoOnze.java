package todasAtividadesDaCarreira;

import java.text.DecimalFormat;
import java.util.Scanner;
public class questaoOnze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##");


        System.out.println("Digite dois números inteiros e um número real");

        System.out.println("Digite o primeiro número inteiro: ");
        int numeroUm = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numeroDois = scan.nextInt();

        System.out.println("Digite o número real: ");
        double numeroReal = scan.nextDouble();

        //System.out.println("Os números inteiros são " + numeroUm+ " e " + numeroDois + " e o número real é " + numeroReal);

        //  ----- letra A - Lembre que o produto é o resultado da conta.

        double valorA = (numeroUm * 2) * ( numeroDois / 2);
        System.out.println(" O produto do dobro do primeiro com metade do segundo é " + valorA);


        // ------- letra B

        //System.out.println("A soma do triplo do primeiro com o terceiro dá: " + (Math.pow(numeroUm,3))); - Forma antiga
        double valorB = (numeroUm * 3) + numeroReal;
        System.out.println("A soma do triplo do primeiro com o terceiro dá: " + valorB);

        //  ---- letra C
        System.out.println("Esse número está ao cubo " + (Math.pow(numeroReal, 3)));

    }
}

    /*
        DecimalFormat ds = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
   */

