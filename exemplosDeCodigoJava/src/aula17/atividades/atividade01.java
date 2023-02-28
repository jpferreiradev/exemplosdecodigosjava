package aula17.atividades;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10:");
        double nota = scan.nextDouble();


        while(nota >= 0 || nota <= 10){
            System.out.println("A nota digitada foi de:" + nota);
        }
        System.out.println("Erro!! Digite um valor válido...");
    }
}
