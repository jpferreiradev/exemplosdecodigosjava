package aula17;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;
        do{

            System.out.println("1 - INSERIR");
            System.out.println("2 - ALTERAR");
            System.out.println("3 - EXLUIR");
            System.out.println("4 - CONSULTAR");
            System.out.println("5 - SAIR");
            System.out.println("Digite sua opção: ");
            opcao = scan.nextInt();


        }while(opcao < 1 || opcao > 5);
        System.out.println(" Opção escolhida " + opcao);


    }
}
