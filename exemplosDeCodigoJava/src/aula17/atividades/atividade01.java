package aula17.atividades;

import java.util.Scanner;


public class atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scan.nextDouble();

        while (nota <= 0 || nota > 10) {

            System.out.println("A nota " + nota + " não é válida.");
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

        }

        System.out.println("Nota digitada:" + nota);

    }

}

// Maneira que a Loiane fez:
/*
    boolean  notaValida = false; // AQUI FOI USADO UMA FLAG ( Estudar sobre isso)

    do{
        System.out.println("Entre com uma nota");
        double nota = scan.nextDouble();
        if( nota >=0 && nota <=10) {
        notaValida = true;
        System.out.println("Você digitou: " + nota);
        } else {
            //notaValida = false;
            System.out.println("Nota inválida, digite novamente.");

        }
         } while(!notaValida);

         }


 */


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

/*
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            System.out.println("Digite novamente, erro...");
            */