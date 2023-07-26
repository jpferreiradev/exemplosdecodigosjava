package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

import java.util.Scanner;

public class ClasseTeste {
    public static void main(String []args){


        double valorSacado;
        double valorDepositado;
        ContaBancaria contajp = new ContaBancaria("Jp",001,-50);
        ContaBancaria contathay = new ContaBancaria("Thay",002,50);

        System.out.println(contajp.getSaldo());
        System.out.println(contathay.getSaldo());
        //contajp.sacar();
        contathay.sacar();
        contathay.depositar();









    }
}
