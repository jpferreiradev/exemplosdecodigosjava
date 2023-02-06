package aula14;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ifElse {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        System.out.println("Minha idade é" + idade);

        if(idade >= 18){
            System.out.println("Você já é de maior");
        } else {
            System.out.println("Você é de menor");
        }
        */

        System.out.println("Digite o valor: ");
        double valor = scan.nextDouble();

        if(valor <= 10){
            System.out.println("Muito barato!");
        } else if(valor > 10 && valor < 15){
            System.out.println("Pedir desconto");
        } else if(valor >= 15 && valor < 17 ){
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Está muito caro");
        }


    }
}
