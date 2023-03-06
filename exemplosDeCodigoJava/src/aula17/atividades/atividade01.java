package aula17.atividades;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota = 0;

        while (nota <= 0 || nota > 10){
                System.out.println("Digite uma nota entre 0 e 10: ");
                nota = scan.nextDouble();
                System.out.println("Digite novamente, erro...");
            }

        System.out.println("Nota digitada:" + nota);

    }

}




/* double nota;
        //double nota;
        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            System.out.println("Valor informado errado, digite novamente...");
        } while (nota <= 0 || nota > 10 );

 */
/*
        while(nota < 0 || nota > 10){
        System.out.println("A nota " + nota + "não é válida");
        System.out.println("Digite uma nota entre 0 e 10");
        nota = scan.nextDouble();
        }


 */