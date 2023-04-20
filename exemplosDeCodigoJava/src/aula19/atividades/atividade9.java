package aula19.atividades;

import java.util.Scanner;

public class atividade9 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[vetorA.length];
        float vetorC[] = new float[vetorB.length];
        


        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite uma posição:" + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
            vetorC[i] = vetorA[i] / vetorC[i];

        }

        System.out.println("Vetor A = ");
        for(int i = 0; i < vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for(int i = 0; i < vetorB.length;i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor C = ");
        for(int i = 0; i < vetorC.length;i++){
            System.out.print(vetorC[i] + " ");
        }

    }

}

