package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {

        System.out.println("------------Testa Conta Bancaria -------------");

        ContaBancaria contaSimles = new ContaBancaria();
        contaSimles.setNomeCliente("Cliente Conta Simples");
        contaSimles.setNumeroConta("11111111");

        contaSimles.depositar(100);

        realizarSaque(contaSimles, 50);
        realizarSaque(contaSimles, 70);

        System.out.println(contaSimles);

        System.out.println("Teste ContaPoupança");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente Conta Poupança");
        contaPoupanca.setNumeroConta("222222");
        contaPoupanca.setDiaRendimento(2);

        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        System.out.println(contaPoupanca);

        System.out.println("-------Teste ContaEspecial--------");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumeroConta("33333");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo:" + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de: " + valor + ", saldo de: " + conta.getSaldo());
        }

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
        int contador = 0;
        while (contador < 50) {
        System.out.println("Repetição nr: " + contador);
        contador++;
        }


        // O que foi feito antes da correção do exercicio

        ContaBancaria contajp = new ContaBancaria("jp",001,-60);
        ContaPoupanca contapaulo = new ContaPoupanca();
        System.out.println(contajp.toString());

        //contajp.sacar();
        //contajp.depositar();

        //System.out.println(contapaulo.calcularNovoSaldo());



     */