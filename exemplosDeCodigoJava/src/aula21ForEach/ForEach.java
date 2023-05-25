package aula21ForEach;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

            int notas[] = new int[10];

            Random random = new Random();

            for(int i = 0; i < notas.length;i++){
                notas[i] = random.nextInt(10);

            }

            for(int i = 0; i < notas.length; i++){
                int nota = notas[i];
                System.out.println(nota);
            }

        System.out.println("Usando o for each!");

            for ( int nota : notas){
                System.out.println(nota);
            }
    // Exemplo 2
        System.out.println("Exemplo com Arrays multidimensionais");
        double[][] notasDeAlunos = new double[3][4];

        notasDeAlunos[0][0] = 10;
        notasDeAlunos[0][1] = 7;
        notasDeAlunos[0][2] = 8;
        notasDeAlunos[0][3] = 5;

        notasDeAlunos[1][0] = 5;
        notasDeAlunos[1][1] = 6;
        notasDeAlunos[1][2] = 7;
        notasDeAlunos[1][3] = 9;

        notasDeAlunos[2][0] = 9;
        notasDeAlunos[2][1] = 6;
        notasDeAlunos[2][2] = 8;
        notasDeAlunos[2][3] = 5;

        for( double[] notasAluno : notasDeAlunos ){
            for(double nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }

    }
}

