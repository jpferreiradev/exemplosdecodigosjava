package todasAtividadesDaCarreira;
import java.text.DecimalFormat;
import java.util.Scanner;

public class questaoDezesseis {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Informe o tamanho da largura: ");
        double tamanhoLargura  = scan.nextDouble();
        System.out.println("Informe o tamanho do comprimento");
        double tamanhoComprimento = scan.nextDouble();

        double calculoMetroQuadrado = tamanhoLargura * tamanhoComprimento;
        System.out.println("O calculo do metro quadrado é de :" + calculoMetroQuadrado + " m");

        double valorLitroPorMetro = 3;
        double conversaoMetrosPorLitros = calculoMetroQuadrado / valorLitroPorMetro;

        //System.out.println(conversaoMetrosPorLitros);

        double quantidadeDeLatasVendidasPorLitro = 18;
        double valorEmRealQuantidadeDeLitros = 80;

        double conversaoQuantidadeDeLatas = conversaoMetrosPorLitros / quantidadeDeLatasVendidasPorLitro;

        double conversaoQuantidadeDeLatasEmReal = conversaoQuantidadeDeLatas * valorEmRealQuantidadeDeLitros;

    System.out.println("A quantidade de latas foram: " + df.format(conversaoQuantidadeDeLatas));
        System.out.println("O preço total foi de R$" + df.format(conversaoQuantidadeDeLatasEmReal) + " reais");








    }
}
