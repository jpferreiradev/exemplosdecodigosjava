package ClassesImportantesEOutros;

import java.util.Scanner;

public class NumeroParEImpar {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int conversao = 2;

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        if( numero % 2 == 0){
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar ");
        }


        }
    }

