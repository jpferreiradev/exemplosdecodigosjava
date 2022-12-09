package todasAtividadesDaCarreira;
import java.util.Scanner;

public class quetaoQuartorze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double pesoPadraoSaoPaulo = 50;
        double valorMultaExcessoPeso = 4;

        System.out.println("Digite o peso:");
        double pesoAtual = scan.nextDouble();


        if(pesoAtual > pesoPadraoSaoPaulo){
            double restoDoPeso = pesoAtual - pesoPadraoSaoPaulo;
            double valorMultaExcesso = restoDoPeso * valorMultaExcessoPeso;
            System.out.println("O valor da multa a ser paga é de R$: " + valorMultaExcesso + "reais");
        } else {
            System.out.println("Você não pagou por excesso de peso. ");
        }




    }
}
