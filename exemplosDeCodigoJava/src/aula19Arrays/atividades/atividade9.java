package aula19Arrays.atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade9 {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[5];
        int vetorB[] = new int[vetorA.length];
        // Usei tipo float, mas a professora usou tipo double
        double vetorC[] = new double[vetorA.length];



        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite uma posição A:" + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
            //vetorC[i] = vetorA[i] / vetorC[i];
        }

        for(int i = 0; i < vetorB.length; i++){
            System.out.println("Digite uma posição B: " + i);
            vetorB[i] = scan.nextInt();
        }

       for(int i = 0; i < vetorC.length;i++){
           vetorC[i] = vetorA[i] / vetorB[i];
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

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Vetor C = ");
        for(int i = 0; i < vetorC.length;i++){
            //System.out.print(df.format(vetorC[i]) + " ");
            System.out.print(vetorC[i] + " ");
        }

    }

}


//