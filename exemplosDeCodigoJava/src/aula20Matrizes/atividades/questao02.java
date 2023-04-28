package aula20Matrizes.atividades;

import java.util.Random;

public class questao02 {
    public static void main(String[] args) {


        int numerosAleatorios[][] = new int[10][10];

       Random numeroRandom = new Random();

       for(int i = 0; i < numerosAleatorios.length;i++){
           for(int j = 0; i < numerosAleatorios[i].length;j++){
               numerosAleatorios[i][j] = numeroRandom.nextInt(100);
           }
           System.out.println(numerosAleatorios[i]);
       }











    }
}


/*

        matrizM[0][0] = 5;
        matrizM[0][1] = 4;
        matrizM[0][2] = 3;
        matrizM[0][3] = 7;
        matrizM[0][4] = 9;
        matrizM[0][5] = 5;
        matrizM[0][6] = 2;
        matrizM[0][7] = 3;
        matrizM[0][8] = 5;
        matrizM[0][9] = 1;


 */