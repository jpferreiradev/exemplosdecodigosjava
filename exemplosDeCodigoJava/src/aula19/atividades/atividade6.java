package aula19.atividades;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[15];
        int vetorB[] = new int[vetorA.length];
        int vetorC[] = new int[vetorA.length + vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite uma posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorC[i] = vetorA.length + vetorB.length;

        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i] + " ");
        }
        System.out.println();
    }
}
