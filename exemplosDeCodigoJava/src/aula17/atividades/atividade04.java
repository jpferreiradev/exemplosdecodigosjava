package aula17.atividades;

import java.text.DecimalFormat;

public class atividade04 {
    public static void main(String[] args) {

       /*
        double numeroHabitantesCidadeA = 80.000;
        double numeroHabitantesCidadeB = 200.000;
        double valorTaxaCrescimentoCidadeA = 3;
        double valorTaxaCrescimentoCidadeB = 1.5;
        double conversaoTaxaCrescimentoCidadeA;
        double conversaoTaxaCrescimentoCidadeB;
        double conversaoDiferençaNumeroHabitantes;
        double conversaoAnosHabitantes;
        DecimalFormat dc = new DecimalFormat("#,###0.000");

        conversaoTaxaCrescimentoCidadeA = (valorTaxaCrescimentoCidadeA / 100) * numeroHabitantesCidadeA;
        conversaoTaxaCrescimentoCidadeB = (valorTaxaCrescimentoCidadeB / 100) * numeroHabitantesCidadeB;

        conversaoDiferençaNumeroHabitantes = numeroHabitantesCidadeB - numeroHabitantesCidadeA;
        conversaoAnosHabitantes = conversaoDiferençaNumeroHabitantes / conversaoTaxaCrescimentoCidadeA;

        System.out.println(dc.format(conversaoTaxaCrescimentoCidadeA));
        System.out.println(dc.format(conversaoTaxaCrescimentoCidadeB));
        System.out.println(conversaoDiferençaNumeroHabitantes);
        System.out.println(conversaoAnosHabitantes);
        */
        // Forma que a professora fez....
        int popA = 80000;
         int popB = 200000;
         int cont = 0;

         while (popA < popB){

             popA += (popA/100) * 3;
             popB += (popB/100) * 1.5;
             cont++;

         }

        System.out.println("População A:" + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont);

    }
}
