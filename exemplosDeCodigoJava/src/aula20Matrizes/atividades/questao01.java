package aula20Matrizes.atividades;

import java.util.Random;

public class questao01 {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4]; // Instanciar a matriz

        Random numeroRandom = new Random(); // Classe para criar numeros aleatorios

        // Criação de uma matriz com numeros aleatorios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;

                }
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);

    }
}



/*
        if(matrizM[0].length > matrizM[1].length){
            System.out.println("A matriz O é maior");
        } else if () {

        }

 matrizM[0][0] = 4;
        matrizM[0][1] = 5;
        matrizM[0][2] = 5;
        matrizM[0][3] = 6;

        matrizM[1][0] = 6;
        matrizM[1][1] = 9;
        matrizM[1][2] = 9;
        matrizM[1][3] = 2;

        matrizM[2][0] = 4;
        matrizM[2][1] = 7;
        matrizM[2][2] = 2;
        matrizM[2][3] = 1;

        matrizM[3][0] = 4;
        matrizM[3][1] = 7;
        matrizM[3][2] = 8;
        matrizM[3][3] = 9;

        */

/*
 int[][] matrizM = new int[4][4]; // Linha e Coluna

        // Criar números aleatorios com a classe Random
        Random numeroRandom = new Random();

        // Exemplo de como gerar números aleatorios em Java utilizando a classe Random;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = numeroRandom.nextInt(100);
            }
        }

        //int maior = Integer.MIN_VALUE;
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] > maior) {
                    maior = matrizM[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        // Aqui você conferir os números aleatorios
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + " "); // Imprimir todos os valores da linha na mesma linha
            }
            System.out.println();
        }


        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);




 */
