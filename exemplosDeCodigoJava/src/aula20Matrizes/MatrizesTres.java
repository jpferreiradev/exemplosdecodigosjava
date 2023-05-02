package aula20Matrizes;

import java.util.Random;

public class MatrizesTres {
    public static void main(String[] args) {

        int x;

        // Primeiro exemplo de como construir um matriz
        //Linhas  e coluna
        int matriz[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 5;
                System.out.println("Posição:" + i + "," + j);
                //System.out.println(matriz[i][j]);
            }
        }
    }
}

/*

matriz[0][0] = 5;
        matriz[0][1] = 5;
        matriz[0][2] = 5;
        matriz[0][3] = 5;
        matriz[0][4] = 5;



Como acessar uma posição na sua matriz;
        matriz[1][3] = 10;
                matriz[2][1] = 5;

                // Exemplo de soma de matrizes
                int soma  = matriz[1][3] + matriz[2][1];
                System.out.println(soma);

 */