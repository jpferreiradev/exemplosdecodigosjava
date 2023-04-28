package aula19Arrays.atividades;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];
        int vetorC[] = new int[vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(" Digite um posição A:" + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
            //vetorC[i] = vetorA[i] - vetorB[i];
        }

        for(int i = 0; i < vetorB.length;i++){
            System.out.println("Digite um posição B: " + i);
            vetorB[i] = scan.nextInt();

        }
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] - vetorB[i];

        }


        System.out.println("A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.println("C = ");
        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();

    }
}

// Mesma coisa da questão 6.