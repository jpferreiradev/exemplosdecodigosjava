package todasAtividadesDaCarreira;

import java.util.Scanner;

public class questaoOito {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto que você ganha por hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Você ganha R$" + valorHora + " por hora trabalhada");
        System.out.println("Informe quantas horas foram trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();
        System.out.println("A quantidade de horas trabalhadas no mês foram de " + horasTrabalhadas + " horas");

        double conversaoHoraSalario = valorHora * horasTrabalhadas;

        System.out.println("O valor total do seu salário é R$" + conversaoHoraSalario + " reais");



    }
}
