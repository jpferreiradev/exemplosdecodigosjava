package todasAtividadesDaCarreira;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questaoDoze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");


        System.out.println("Digite a sua altura: ");
        double minhaAltura = scan.nextDouble();

        double conversaoPesoIdeal = (72.7 * minhaAltura ) - 58;
        System.out.println("Seu peso é: " + df.format(conversaoPesoIdeal) + " kg");
    }

}
