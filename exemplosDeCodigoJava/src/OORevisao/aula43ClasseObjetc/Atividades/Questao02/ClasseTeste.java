package OORevisao.aula43ClasseObjetc.Atividades.Questao02;

import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {


        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("023.899.045-34");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("91.403.512/0001-54");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p3.setCpf("678.567.8756-34");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(5000);
        p4.setCnpj("34.567.234/0003056");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3000);
        p5.setCpf("678-345-035-23/5678-34");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4500);
        p6.setCnpj("567-323-789/0004-45");


        Contribuinte[] contribuintes = new Contribuinte[6]; // Aqui temos o exemplo de Upcasting ( Conversão de classes no Java)
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for( Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }
    }
}

/*
        // O que foi feito antes da correção

        Scanner scan = new Scanner(System.in);

        PessoaJuridica jp = new PessoaJuridica();
        PessoaJuridica thay = new PessoaJuridica("Thay");
        PessoaFisica JP = new PessoaFisica();
        PessoaFisica THAY = new PessoaFisica("THAY");


        System.out.println("Informe quanto é a sua renda bruta:");


 */