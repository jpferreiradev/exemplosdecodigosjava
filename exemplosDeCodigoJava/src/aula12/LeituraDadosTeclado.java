package aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite o seu nome:");
        String meuNome = scan.nextLine();
        System.out.println("Seu nome completo é: " + meuNome);

        System.out.println("Digite o seu primeiro nome");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade:");
        int minhaIdade = scan.nextInt();
        System.out.println("Sua idade é: " + minhaIdade + " anos");

        System.out.println("Digite a sua altura");
        double minhaAltura = scan.nextDouble();
        System.out.println("Sua altura é" + minhaAltura);*/

        System.out.println("Digite o seu nome, idade, altura, quantidade de filhos, e quantos bixos de estimação você tem");
        String meuNome = scan.nextLine();
        int minhaIdade = scan.nextInt();
        double minhaAltura = scan.nextDouble();
        byte quantidadeFilhos = scan.nextByte();
        byte quantidadeBixosEstimacao = scan.nextByte();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Seu nome: " + meuNome);
        System.out.println("Sua idade: " + minhaIdade);
        System.out.println("Minha altura é: " + minhaAltura);
        System.out.println("Tem quantos filhos: " + quantidadeFilhos);
        System.out.println("Tem bixo de estimação: " + quantidadeBixosEstimacao);





    }
}
