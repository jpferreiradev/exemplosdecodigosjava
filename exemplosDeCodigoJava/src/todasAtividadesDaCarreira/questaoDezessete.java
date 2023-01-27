package todasAtividadesDaCarreira;
import java.util.Scanner;

public class questaoDezessete {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho da largura: ");
        double tamanhoLargura  = scan.nextDouble();
        System.out.println("Informe o tamanho do comprimento");
        double tamanhoComprimento = scan.nextDouble();

        double calculoMetroQuadrado = tamanhoLargura * tamanhoComprimento;
        System.out.println("O calculo do metro quadrado é de :" + calculoMetroQuadrado + " m");

    }
}
