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
        System.out.println("O valor da sua hora foi de " + valorHora + " e o números de horas trabalhadas foi " + horasTrabalhadas);

        double valorSalarioBruto = valorHora * horasTrabalhadas;
        double valorDescontoIR = 0;
        double valorDescontoINSS = valorSalarioBruto * 0.10;
        double valorDescontoFGTS = valorSalarioBruto * 0.11;
        double valorTotalDescontos;
        double valorSalarioLiquido;


        if (valorSalarioBruto < 900) {
            System.out.println("Pelo valor do seu salário, você é isento");
        } else if (valorSalarioBruto > 900 && valorSalarioBruto <= 1500) {
            double valorSalarioDescontoIR = valorSalarioBruto * 0.05;
            valorTotalDescontos = valorSalarioDescontoIR + valorDescontoINSS;
            valorSalarioLiquido = valorSalarioBruto - valorTotalDescontos;
            System.out.println("Valor total de descontos :" + valorTotalDescontos);
            System.out.println("O valor do seu salário liquído é " + valorSalarioLiquido);
            System.out.println("Pelo valor do seu salário, o seu desconto é de 5%, o valor descontado foi de: " + valorSalarioDescontoIR);
        } else if (valorSalarioBruto > 1500 && valorSalarioBruto < 2500) {
            double valorSalarioDescontoIR = valorSalarioBruto * 0.10;
            valorTotalDescontos = valorSalarioDescontoIR + valorDescontoINSS;
            valorSalarioLiquido = valorSalarioBruto - valorTotalDescontos;
            System.out.println("Valor total de descontos :" + valorTotalDescontos);
            System.out.println("O valor do seu salário liquído é " + valorSalarioLiquido);
            System.out.println("Pelo valor do seu salário, o seu desconto é de 10%, o valor descontado foi de: " + valorSalarioDescontoIR);
        } else if (valorSalarioBruto > 2500) {
            double valorSalarioDescontoIR = valorSalarioBruto * 0.20;
            valorTotalDescontos = valorSalarioDescontoIR + valorDescontoINSS;
            valorSalarioLiquido = valorSalarioBruto - valorTotalDescontos;
            System.out.println("Valor total de descontos :" + valorTotalDescontos);
            System.out.println("O valor do seu salário liquído é " + valorSalarioLiquido);
            System.out.println("Pelo valor do seu salário, o seu desconto no IR é de 20%, o valor descontado foi de: " + valorSalarioDescontoIR);
        }


        System.out.println("---------------");
        System.out.println("O valor do seu salário bruto:" + valorSalarioBruto);
        System.out.println("Valor desconto INSS [10%]: " + valorDescontoINSS);
        System.out.println("Valo desconto FGTS[11%]:" + valorDescontoFGTS);


    }
}


