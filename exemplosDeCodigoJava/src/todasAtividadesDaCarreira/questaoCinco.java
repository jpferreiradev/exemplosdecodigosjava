package todasAtividadesDaCarreira;

import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do metro: ");
        int valorMetro = scan.nextInt();
        int valorCenti = 10 * 10;
        int conversaoMetroParaCenti = valorMetro * valorCenti;

        System.out.println("A conversão de metro para centímetros é de " + conversaoMetroParaCenti + " cm");


    }
}
