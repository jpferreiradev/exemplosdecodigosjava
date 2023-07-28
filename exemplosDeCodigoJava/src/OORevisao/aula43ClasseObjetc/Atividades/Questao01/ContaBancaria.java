package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

import java.util.Scanner;

public class ContaBancaria {

    private String nomeCliente;
    private int numeroConta;
    private double saldo;

    Scanner scan = new Scanner(System.in);

    ContaBancaria() {

    }

    ContaBancaria(String nomeCliente, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar() {

        double valorSacado;
        double conversaoSaca;
        double novoSaldo = getSaldo();

        System.out.println("Informe o quanto você quer sacar:");
        valorSacado = scan.nextDouble();
        conversaoSaca = getSaldo() - valorSacado;

        while (getSaldo() <= -0) {
            System.out.println("Seu saldo não pode ser negativo...");
            System.out.println("Informe novamente o seu novo saldo: ");
            novoSaldo = scan.nextDouble();
            //valorSacado = scan.nextDouble();
        }
        System.out.println("Seu novo saldo é: " + conversaoSaca);
        return 0;
        //while(getSaldo() < -0 || conversaoSaca < -0){

    }

    public double depositar() {
        double valorDepositado;
        double conversaoDeposita;

        System.out.println("Informe quanto você quer depositar:");
        valorDepositado = scan.nextDouble();
        conversaoDeposita = getSaldo() + valorDepositado;
        System.out.println("Seu novo saldo é: " + conversaoDeposita);

        return 0;
    }

    @Override
    public String toString() {
        return "ContaBancaria: " + "\n" +
                "Nome do cliente: " + nomeCliente + "\n" +
                "Numero da conta :" + numeroConta + "\n" +
                "Saldo:" + saldo;

    }
}

/*

 @Override
    public String toString() {
        return "ContaBancaria: " + "\n"+
                "Nome do cliente: " + nomeCliente + '\'' +
                ", Numero da conta :" + numeroConta +
                ", Saldo:" + saldo +
                '}';


 */

/*
//System.out.println("Saldo compatível");
        //if (getSaldo() < 0 || conversaoSaca < 0) {
        //    System.out.println("O saldo não pode ser negativo, informe um saldo compativel");
        //} else {

 */