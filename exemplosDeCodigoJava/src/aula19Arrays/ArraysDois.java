package aula19Arrays;

public class ArraysDois {
    public static void main(String[] args) {

        // Linha/Coluna
        int[][] valor = new int[5][5];


        // Exemplo de como atribuir 5 valores para a coluna e também como fazer para preencher toda a matriz
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                valor[i][j] = 5;
                //valor[j][i] = 5;
                //System.out.print(valor[i][j] + " ");
                System.out.println("Posição: " + i + "," + j);
            }


        }


    }

}


  /*
        valor[0][0] = 5;
        valor[0][1] = 5;
        valor[0][2] = 5;
        valor[0][3] = 5;
        valor[0][4] = 5;
        */


/*
        Imprimindo na tela
        for (int i = 0; i < 5; i++) {
            System.out.println(valor[0][i] = 5);
        }

 */

/* Exemplo 2

  //                       Linha/ Coluna
        // int x; Int do tipo valor primitivo

        // Integer é uma classe, o valor padrão dele é null
        Integer valores[][] = new Integer[5][5];


        // Como acessar o elemento na sua matriz
        //valores[1][3] = 10;
        //valores[2][1] = 5;

        // Soma de matrizes no Java
        //Integer soma = valores[1][3] + valores[2][1];
        //System.out.println(valores[2][2]);

 */


/* exemplo 1


 valores[0][0] = 5;
        valores[0][2] = 10;
        valores[0][2] = 4;
        //valores[]

        // exemplo de soma de array
        //int soma =  valores[0] + valores[1] + valores[2];

        //System.out.println(soma);
 */