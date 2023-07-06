package todasAtividadesDaCarreira;

import java.util.Scanner;

public class questaoTres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números e no final terá a soma deles: ");
        System.out.println("Digite o primeiro número: ");
        int numeroUm = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numeroDois = scan.nextInt();
        int somaDoisNumeros = numeroUm + numeroDois;
        System.out.println("Os números digitados foram" + numeroUm + " e " + numeroDois + " a soma deles dois é: " + somaDoisNumeros);

    }
}
