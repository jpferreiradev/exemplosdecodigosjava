package aula16;

import java.util.Scanner;

public class LoopWhileExemploDois {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Exemplo simples do While

        int contador = 0;
        while(contador <= 50){
            System.out.println(contador);
            contador++;
        }

        String nome;
        System.out.println("Digite o seu nome ou s pra sair:");
        nome = scan.nextLine();
        while(!nome.equals("s")){ // O ponto exclamação é a negação, ele vai inverter o valor logico nome
            System.out.println("Bem-vindo:" + nome);
            System.out.println("Digite seu nome ou s pra sair:");
            nome = scan.nextLine();
        }
        System.out.println("Fim da execução!");

        // Exemplo de do/while


    }
}
