package aula17.atividades;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String meuNome = scan.nextLine();
        System.out.println("Digite uma senha:");
        String minhaSenha = scan.nextLine();


        while (minhaSenha.equalsIgnoreCase(meuNome)){
            System.out.println("Erro!!! Você não pode colocar seu nome como senha.");
            System.out.println("Repita novamente....");

        }
        System.out.println("Parabéns, cadastro feito com sucesso!");
    }

}
