package aula19Arrays.atividades;

import java.util.Scanner;

public class atividade00 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double nota[] = new double [3];



        System.out.println("Digite o seu nome:");
        nome = scan.nextLine();
        System.out.println("Digite a sua primeira nota: ");
        nota[0] = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota[1] = scan.nextDouble();

        nota[2] = (nota[0] + nota[1]) / 2;

        System.out.println("O aluno: "+ nome + " tirou na primera nota: " + nota[0] + "e na segunda: " + nota[1] + "e a média delas é: " + nota[2]);





    }

}
