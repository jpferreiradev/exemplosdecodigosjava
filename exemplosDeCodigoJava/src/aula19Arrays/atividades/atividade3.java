package aula19Arrays.atividades;

import java.util.Scanner;


public class atividade3 {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a[] = new int[15];
        int b[] = new int[a.length];

        for(int i = 0;i < a.length;i++){
            System.out.println("Digite uma posição:" + i);
            a[i] = scan.nextInt();
            b[i] = a[i] * a[i];
        }

        for(int i = 0; i <a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < b.length;i++){
            System.out.print(b[i] + " ");
        }

    }

}
