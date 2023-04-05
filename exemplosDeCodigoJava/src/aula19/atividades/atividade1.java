package aula19.atividades;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[a.length];

        for(int i = 0; i < a.length;i++){

            System.out.println("Digite um valor da posição:" + i);
            a[i] = scan.nextInt();
            b[i] = a[i];
        }

        System.out.println("A = ");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("B = ");
        for(int i = 0; i < b.length;i++){
            System.out.print(b[i] + " " );
        }
        System.out.println();
    }
}

/*

                for(int i = 0;i < a.length;i++) {
                for (int i = 0; i < b.length; i++)
                System.out.println("Os valores de A são: " + a[i]);
                System.out.println("Os valores de B são:" + b[i]);
            }
        }

// Aqui seria outra forma de fazer o for
        //for(int i = 0; i < a.length;i++){
        //    b[i] = a[i];

        //}


 */