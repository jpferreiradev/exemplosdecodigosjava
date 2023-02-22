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

        double valorSalarioBruto = valorHora * horasTrabalhadas;
        double valorDescontoIR = valorSalarioBruto * 0.05;
        double valorDescontoINSS = valorSalarioBruto * 0.10;
        double valorDescontoFGTS = valorSalarioBruto * 0.11;
        double valorTotalDescontos =  valorDescontoIR + valorDescontoINSS;
        double valorSalarioLiquido = valorSalarioBruto - valorTotalDescontos;



        System.out.println("O valor do seu salário bruto:" + valorSalarioBruto);
        System.out.println("---------------");

        System.out.println("Valor desconto IR [5%]: " + valorDescontoIR);
        System.out.println(" Valor desconto INSS [10%]: " + valorDescontoINSS);
        System.out.println("Valo desconto FGTS[11%]:" + valorDescontoFGTS);
        System.out.println("Valor total de descontos :" + valorTotalDescontos);
        System.out.println("Valor salário liquido: " + valorSalarioLiquido);




    }
    }


