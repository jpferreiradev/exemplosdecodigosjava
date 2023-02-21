package aula15.atividades;

import java.util.Scanner;
import java.text.DecimalFormat;
public class questaoDoze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //DecimalFormat df = new DecimalFormat();
        //df.format("R$ #,##0.00");

        System.out.println("Informe o valor da sua hora trabalhada: ");
        double valorHora = scan.nextDouble();
        System.out.println("Informe a quantidade de horas que foram trabalhadas:");
        int horasTrabalhadas = scan.nextInt();
        System.out.println("O valor da sua hora foi de " +  valorHora + " e o números de horas trabalhadas foi " + horasTrabalhadas);


    }
    }


