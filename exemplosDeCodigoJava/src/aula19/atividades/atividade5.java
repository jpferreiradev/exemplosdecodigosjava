package aula19.atividades;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < vetorA.length;i++){
            System.out.println("Digite um posição: " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        for(int i = 0;i < vetorB[i]; i++ ){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();
    }
}
