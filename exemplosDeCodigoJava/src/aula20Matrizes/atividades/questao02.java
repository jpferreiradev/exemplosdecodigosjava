package aula20Matrizes.atividades;

import java.util.Random;

public class questao02 {
    public static void main(String[] args) {


        int [][] valoresAleatorios = new int[10][10];

        Random numerosAleatorios = new Random();


        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                valoresAleatorios[i][j] = numerosAleatorios.nextInt(10);
            }

        }

        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 11;
        int linha5 = 5;
        for (int i = 0; i < valoresAleatorios[linha5].length; i++) {
            if (valoresAleatorios[linha5][i] > maiorL5) {
                maiorL5 = valoresAleatorios[linha5][i];
            }
            if (valoresAleatorios[linha5][i] < menorL5) {
                menorL5 = valoresAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da linha 5:" + menorL5);

        int maiorColuna7 = 0;
        int menorColuna7 = 11;
        int coluna7 = 7;

        for (int i = 0; i < valoresAleatorios.length; i++) {
            if (valoresAleatorios[i][coluna7] > maiorColuna7) {
                maiorColuna7 = valoresAleatorios[i][coluna7];
            }
            if (valoresAleatorios[i][coluna7] < menorColuna7) {
                menorColuna7 = valoresAleatorios[i][coluna7];
            }

        }
        System.out.println("Maior valor da coluna 7: " + maiorColuna7);
        System.out.println("Menor valor da coluna 7:" + menorColuna7);

    }
}


// valoresAletorios[4][0] linha
// valoresAleatorios[][7] coluna

/*
        int valorMaiorLinha = 0;
        int valorMenorLinha = 0;
        int valorMaiorColuna = 0;
        int valorMenorColuna = 0;
        for(int i = 0; i < valoresAleatorios.length; i++){ // linha
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                //if(numerosAleatorios[i][j] > )
        */



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



        /*
        // mostrando a matriz com os numeros
        for(int i = 0; i < valoresAleatorios.length;i++){
            for(int j = 0; j < valoresAleatorios[i].length;j++){
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int linha = 0;
        int coluna = 0;
        */



