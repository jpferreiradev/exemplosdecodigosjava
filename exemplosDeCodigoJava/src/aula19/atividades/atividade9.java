package aula19.atividades;

import java.util.Scanner;

public class atividade9 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];
        int vetorC[] = new int[vetorB.length];
        float vetor[] = new float[vetorC.length];


        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite uma posição:" + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
            //vetorC[i] = vetorA[i] / vetor[i];

        }
    }

}

