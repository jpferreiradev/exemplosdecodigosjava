package aula19.atividades;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
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

  /*
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }
       */