package todasAtividadesDaCarreira;

import java.util.Scanner;
public class questaoDezoito {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o tamanho do programa em MB: ");
        double tamanhoPrograma = scan.nextDouble();
        System.out.println("Digite a velocidade de internet: ");
        double velocidadeInternet = scan.nextDouble();
        System.out.println("O tamanho do programa és de " + tamanhoPrograma + "MB" + " e a velocidade da internet é de " + velocidadeInternet+
        "Mbps");

        //double conversaoEmMinutos = tamanhoPrograma * velocidadeInternet;
        //System.out.println(conversaoEmMinutos);
        //teste
        double conversaoEmMi = tamanhoPrograma / velocidadeInternet;
        System.out.println("Tempo de download é " + conversaoEmMi + " min");
    }
}
