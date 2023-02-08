package aula15.atividades;

import java.util.Scanner;
import java.text.DecimalFormat;

public class questaoOito {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        System.out.println("Informe o preço dos três produtos");

        System.out.println("Primeiro produto");
        double primeiroProduto = scan.nextDouble();
        System.out.println("Segundo produto");
        double segundoProduto = scan.nextDouble();
        System.out.println("Terceiro produto");
        double tercerioProduto = scan.nextDouble();

        System.out.println("Os preços dos produtos são: " + (df.format(primeiroProduto) + "," + (df.format(segundoProduto) + "," + (df.format(tercerioProduto)))));

        if(primeiroProduto < segundoProduto || primeiroProduto < tercerioProduto){
            System.out.println("Menor preço é: " + primeiroProduto );
        } else if(segundoProduto < primeiroProduto || segundoProduto < tercerioProduto)  {
            System.out.println("Menor preço é: " + segundoProduto);
        } else if (tercerioProduto < primeiroProduto || tercerioProduto < segundoProduto ) {
            System.out.println("Menor preço é: " + tercerioProduto);
        }


    }
}
