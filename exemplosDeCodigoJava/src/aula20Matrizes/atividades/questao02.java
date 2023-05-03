package aula20Matrizes.atividades;

import java.util.Random;

public class questao02 {
    public static void main(String[] args) {


        Random numerosAleatorios = new Random();

        int valoresAleatorios[][] = new int[10][10];



        // gerando os numeros aleatorios
        for(int i = 0; i < valoresAleatorios.length; i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                valoresAleatorios[i][j] = numerosAleatorios.nextInt(10);
            }
        }
        // mostrando a matriz com os numeros
        for(int i = 0; i < valoresAleatorios.length;i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();
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