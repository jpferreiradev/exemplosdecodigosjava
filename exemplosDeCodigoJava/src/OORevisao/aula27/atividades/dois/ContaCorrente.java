package OORevisao.aula27.atividades.dois;

import java.util.Scanner;

public class ContaCorrente {

    int numeroConta;
    double saldoConta;
    boolean contaEspecial;
    double limiteConta;

    Scanner scan = new Scanner(System.in);


    void saque(){
        System.out.println("Informe quanto você quer sacar?");
        double valorSaque = scan.nextDouble();
        System.out.println("Você quer sacar:" + valorSaque);
        double valorSacado = saldoConta - valorSaque;
        System.out.println("Seu anterior era de: R$" + saldoConta + "agora é de:R$" + valorSacado + " reais");

    }
    void  deposita(){
        System.out.println("Informe quanto você quer depositar?");
        double valorDeposito = scan.nextDouble();
        System.out.println("Você quer depositar:" + valorDeposito);
        double valorDepositado = saldoConta + valorDeposito;
        System.out.println("Seu saldo anterior antes do deposito: R$" + saldoConta + "agora é de:R$" + valorDepositado + " reais");
    }
    void consultaSaldo(){
        System.out.println("O valor do seu saldo é R$: " + saldoConta +" reais" );

    }

    boolean tipoConta(){

        if(contaEspecial == true){
            System.out.println("Sua conta é especial");
        } else {
            System.out.println("Sua conta é normal");
        }
        return contaEspecial;
    }
    void validaConta(){
        if(saldoConta > 0){
            System.out.println("Essa conta é válida");
        } else {
            System.out.println("Conta inválida");
        }
    }
}



