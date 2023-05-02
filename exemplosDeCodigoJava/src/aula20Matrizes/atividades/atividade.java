package aula20Matrizes.atividades;

import java.util.Locale;
import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {

        //Locale.setDefault(Locale.US); // Aceitar o . como separador de decimais
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz:");
        int n = scan.nextInt();

        double matriz[][] = new double[n][n];

        // Exemplo digitando na matriz || Lendo os dados e guardando na matriz
        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scan.nextDouble();
            }
        }

        // Imprimindo a matriz | Pecorrendo os dados e mostrando a matriz na tela
        //System.out.println("Matriz digitada: ");

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    soma = soma + matriz[i][j];
                }
                //soma = soma + matriz[i][j];
                //System.out.print(" " + matriz[i][j]);
            }

        }

        System.out.println(" Soma da diagonal principal =  " + soma);
    }
}

 /*
        double soma = 0.0;
        for( int i = 0; i < n; i++){
            for(int j = 0; i < n; j++){
                if(i == j){
                    soma = soma + matriz[i][j];
                }
            }
            System.out.println("Soma da diagonal principal é :" + soma);
        }
        */