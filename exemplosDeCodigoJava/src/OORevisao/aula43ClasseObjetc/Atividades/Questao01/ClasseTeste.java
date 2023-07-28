package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {

        ContaBancaria contajp = new ContaBancaria("jp",001,-60);
        ContaPoupanca contapaulo = new ContaPoupanca();
        System.out.println(contajp.toString());

        contajp.sacar();
        //contajp.depositar();

        //System.out.println(contapaulo.calcularNovoSaldo());


    }
}

/*
         DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");

        double valorSacado;
        double valorDepositado;
        ContaBancaria contajp = new ContaBancaria("Jp",001,-50);
        ContaBancaria contathay = new ContaBancaria("Thay",002,1000);
        ContaPoupanca contateste = new ContaPoupanca();
        //System.out.println(contajp.getSaldo());
        //System.out.println(contathay.getSaldo());
        //contajp.sacar();
        //contathay.sacar();
        //contathay.depositar();
        //System.out.println(contajp.toString());



        double valorRendimento = 0.5 / 100;
        double teste = 1.000 * valorRendimento;
        double teste2 = teste + 1.000;
        //System.out.println(valorRendimento);
        System.out.println(df.format(teste));
        System.out.println(teste);
        System.out.println(teste2);

    //System.out.println(contateste.calcularNovoSaldo());
   */

    /*
    int contador = 0;
        while (contador < 50) {
        System.out.println("Repetição nr: " + contador);
        contador++;
        }


     */