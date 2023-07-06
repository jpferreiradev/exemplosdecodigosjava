package aula19Arrays;

import java.util.Scanner;

public class Volta {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[vetorA.length];

        for(int i = 0; i < vetorA.length;i++){
            System.out.println("Digite uma posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        //System.out.print("As posições são:" + vetorB.length);

        System.out.println("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for(int i = 0; i < vetorB.length;i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
