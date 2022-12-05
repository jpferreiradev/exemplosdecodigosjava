package todasAtividadesDaCarreira;
import java.util.Scanner;

public class questaoQuatro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as suas quatro notas bimestrais: ");

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double terceiraNota = scan.nextDouble();
        System.out.println("Digite a quarta nota");
        double quartaNota = scan.nextDouble();

        double somaDeTodasAsNotas= primeiraNota + segundaNota + terceiraNota + quartaNota;
        double mediaDasNotas = somaDeTodasAsNotas / 4;

        System.out.println("A média é: " + mediaDasNotas);



    }
}
