package aula20Matrizes.atividades;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        // Criando as matrizes
        System.out.println("Digite os valores: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = scan.nextInt();
            }
        }
        // Mostrando as matrizes
        System.out.println("Os números são: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        int quantidadePar = 0;
        int quantidadeImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] % 2 == 0) {
                    quantidadePar++;
                } else {
                    quantidadeImpar++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + quantidadePar);
        System.out.println("Quantidade de impares: " + quantidadeImpar);
    }

}



