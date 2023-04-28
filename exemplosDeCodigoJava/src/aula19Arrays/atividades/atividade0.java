package aula19Arrays.atividades;

import java.util.Scanner;

public class atividade0 {

    public static void main(String[] args) {

        int[] valor = new int[3];
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números inteiros: ");

        System.out.println("Primeiro número: ");
        valor[0] = scan.nextInt();
        System.out.println("Segundo número: ");
        valor[1] = scan.nextInt();
        System.out.println("Terceiro número: ");
        valor[2] = scan.nextInt();

        for(int i = 0; i<valor.length;i++){
            System.out.println("Os valores são: " + valor[i]);
        }

    }







}
