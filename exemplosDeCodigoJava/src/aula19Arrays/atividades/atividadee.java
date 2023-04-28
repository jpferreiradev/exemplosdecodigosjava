package aula19Arrays.atividades;

import java.util.Scanner;

public class atividadee {
    public static void main(String[] args){

                                // linha/ coluna
        double m[][] = new double[3][3];

        Scanner scan = new Scanner(System.in);

        for(double i = 0; i < 3; i++){
            for(double j = 0; j < 3; j++){
                //System.out.println("Digite os valores da matriz" + i);
                //i = scan.nextDouble();
                //System.out.println("Digite ");
                System.out.println("Os números são:" + i  +" , " + j);
            }

        }
    }
}
