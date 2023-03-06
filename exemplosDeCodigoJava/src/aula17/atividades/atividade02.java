package aula17.atividades;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String meuNome;
        String minhaSenha;

        System.out.println("Digite o seu nome: ");
        meuNome = scan.nextLine();
        System.out.println("Digite sua senha: ");
        minhaSenha = scan.nextLine();

        while(minhaSenha.equalsIgnoreCase(meuNome)){
            System.out.println("Sua senha não pode ser igual ao seu nome de usuário, repita por favor...");

        }
        System.out.println("Parabéns, cadastro feito com sucesso!");
        System.out.println("Seu usuario é:" + meuNome);
        System.out.println("Sua senha é: " + minhaSenha);

    }

}

/*do{
            System.out.println("Digite o seu nome:");
            meuNome = scan.nextLine();
            System.out.println("Digite uma senha:");
            minhaSenha = scan.nextLine();
        } while(minhaSenha.equalsIgnoreCase(meuNome));

        System.out.println("Parabéns, cadastro feito com sucesso!");
        System.out.println("Seu usuario é:" + meuNome);
        System.out.println("Sua senha é: " + minhaSenha);

 */

/* while(minhaSenha.equalsIgnoreCase(meuNome)){
            System.out.println("Senha inválida, tente novamente...");

        }

        System.out.println("Parabéns, cadastro feito com sucesso!");
        System.out.println("Seu usuario é:" + meuNome);
        System.out.println("Sua senha é: " + minhaSenha);


 */