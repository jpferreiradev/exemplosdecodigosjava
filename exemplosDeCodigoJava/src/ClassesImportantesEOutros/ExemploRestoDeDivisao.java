package ClassesImportantesEOutros;

import java.util.Scanner;
public class ExemploRestoDeDivisao {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o primeiro valor:");
        int a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scan.nextInt();

        int valorDivisao = a % b;

        System.out.println(valorDivisao);
    }
}
