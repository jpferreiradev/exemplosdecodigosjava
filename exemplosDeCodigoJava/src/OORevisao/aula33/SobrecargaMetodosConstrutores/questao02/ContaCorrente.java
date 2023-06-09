package OORevisao.aula33.SobrecargaMetodosConstrutores.questao02;

import java.util.Scanner;

public class ContaCorrente {

    Scanner scan = new Scanner(System.in);

    int numeroConta;
    double saldo;
    boolean tipoConta;
    int limite;

    public ContaCorrente(int numero, double saldo, boolean tipoConta) {
        this.numeroConta = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;

    }
    public ContaCorrente(int numero, double saldo, boolean tipoConta, int limite) {
        this.numeroConta = numero;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.limite = limite;
    }


    public ContaCorrente() {

    }


    public int getNumeroConta() {
        return this.numeroConta = numeroConta;
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

    public boolean getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(boolean tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getLimite() {
        return this.limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void sacar(){

        System.out.println("Informe quanto você quer sacar: ");
        double valorSacar = scan.nextDouble();
        System.out.println("Você está sacando dessa conta: " + valorSacar);
        System.out.println("Seu saldo atual é:" + getSaldo());
        double valorSacado = valorSacar - getSaldo();
        System.out.println("Seu atual depois do saque é:" + getSaldo());
    }

    public void depositar(){
        System.out.println("Informe quanto você quer depositar: ");
        double valorDepositar = scan.nextDouble();
        System.out.println("Você está despositando nessa conta: " + valorDepositar);
        System.out.println("Seu saldo atual é:" + getSaldo());
        double valorSacado = valorDepositar + getSaldo();
        System.out.println("Seu atual depois do deposito é:" + getSaldo());
    }

    public void consultaSaldo(){
        System.out.println("Seu saldo atual é:R$ " + getSaldo() + " reais");
    }

    void validaConta(){
        if(saldo > 0){
            System.out.println("Essa conta é válida");
        } else {
            System.out.println("Conta inválida");
        }
    }

    boolean tipoConta(){

        if(tipoConta == true){
            System.out.println("Sua conta é especial");
        } else {
            System.out.println("Sua conta é normal");
        }
        return tipoConta;
    }

}


