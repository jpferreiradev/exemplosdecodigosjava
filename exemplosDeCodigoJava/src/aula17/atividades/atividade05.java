package aula17.atividades;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean infoValida = true;

        do {
            System.out.println("Informe a quantidade de habitantes:");
            double valorQuantidadeHabitante = scan.nextDouble();
            System.out.println("Informe a taxa de crescimento:");
            double valorTaxaCrescimento = scan.nextDouble();

            System.out.println("O número de habitantes é: " + valorQuantidadeHabitante + " e a taxa de crescimento é de:" + valorTaxaCrescimento + "%");

            double conversaoTaxaCrescimento = (valorTaxaCrescimento / 100) * valorQuantidadeHabitante;

            System.out.println("O número de habitantes com a taxa de crescimento de: " + valorTaxaCrescimento + " é de " + conversaoTaxaCrescimento +
                    "habitantes por ano");

            infoValida = false;
        } while (!infoValida);
    }
}