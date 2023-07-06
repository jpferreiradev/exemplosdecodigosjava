package todasAtividadesDaCarreira;

import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do metro: ");
        double valorMetro = scan.nextDouble();
        double valorCenti = 10*10;
        double conversaoMetroParaCenti = valorMetro * valorCenti;

        System.out.println("A conversão de metro para centímetros é de " + conversaoMetroParaCenti + " cm");

        // Unico erro foi que a professora botou em double e não em int
    }
}
