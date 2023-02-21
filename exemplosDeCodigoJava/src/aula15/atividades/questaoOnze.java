package aula15.atividades;

import java.util.Scanner;
import java.text.DecimalFormat;
public class questaoOnze {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.format("R$ #,##0.00");

        System.out.println("Informe o seu salário:");
        double salarioColaborador = scan.nextDouble();
        System.out.println("Seu salário atua é de:" + df.format(salarioColaborador));

        double valorPorcentagem = 0;
        double conversaoAjusteSalario =  salarioColaborador * valorPorcentagem;
        double conversaoSalarioReajustado = conversaoAjusteSalario + salarioColaborador;

        if(salarioColaborador <= 280){
            valorPorcentagem = 0.20;
            conversaoAjusteSalario = salarioColaborador * valorPorcentagem;
            System.out.println("Seu salário atual antes do reajuste:" + salarioColaborador);
            System.out.println("O percentual de aumento aplicado é de 20% ");
            System.out.println("O valor do aumento foi de: " + df.format(conversaoAjusteSalario));
            System.out.println("Seu novo salário é de:" + df.format(conversaoSalarioReajustado + conversaoAjusteSalario));

        } else if (salarioColaborador > 280 && salarioColaborador <= 700 ) {
            valorPorcentagem = 0.15;
            conversaoAjusteSalario = salarioColaborador * valorPorcentagem;
            System.out.println("Seu salário atual antes do reajuste:" + salarioColaborador);
            System.out.println("O percentual de aumento aplicado é de 15% ");
            System.out.println("O valor do aumento foi de: " + df.format(conversaoAjusteSalario));
            System.out.println("Seu novo salário é de:" + df.format(conversaoSalarioReajustado + conversaoAjusteSalario));
        } else if (salarioColaborador > 700 && salarioColaborador <= 1500) {
            valorPorcentagem = 0.10;
            conversaoAjusteSalario = salarioColaborador * valorPorcentagem;
            System.out.println("Seu salário atual antes do reajuste:" + salarioColaborador);
            System.out.println("O percentual de aumento aplicado é de 10% ");
            System.out.println("O valor do aumento foi de: " + df.format(conversaoAjusteSalario));
            System.out.println("Seu novo salário é de:" + df.format(conversaoSalarioReajustado + conversaoAjusteSalario));
        } else if (salarioColaborador > 1500) {
            valorPorcentagem = 0.5;
            conversaoAjusteSalario = salarioColaborador * valorPorcentagem;
            System.out.println("Seu salário atual antes do reajuste:" + salarioColaborador);
            System.out.println("O percentual de aumento aplicado é de 5% ");
            System.out.println("O valor do aumento foi de: " + df.format(conversaoAjusteSalario));
            System.out.println("Seu novo salário é de:" + df.format(conversaoSalarioReajustado + conversaoAjusteSalario));
        }


    }
}


// System.out.println("Menor preço é: " + df.format(primeiroProduto) );

/*
salario até 280




 */