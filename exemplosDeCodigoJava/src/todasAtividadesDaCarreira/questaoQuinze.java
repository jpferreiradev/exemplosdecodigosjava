package todasAtividadesDaCarreira;
import java.util.Scanner;
public class questaoQuinze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quanto você ganha por hora e o número de horas trabalhas:");
        double valorHoraTrabalhada = scan.nextDouble();
        int numeroDeHorasTrabalhadas = scan.nextInt();

        System.out.println("Você ganha R$" + valorHoraTrabalhada + " reais , por horas trabalhada e trabalha  " + numeroDeHorasTrabalhadas + " horas por mês ");

        double valorTotalSalarioMesBruto = valorHoraTrabalhada * numeroDeHorasTrabalhadas;

        System.out.println("O valor do seu salário bruto é R$" + valorTotalSalarioMesBruto + " reais");

        double conversaoValorDescontoIR = (valorTotalSalarioMesBruto * 11) / 100;
        double conversaoValorDescontoINSS = (valorTotalSalarioMesBruto * 8) / 100;
        double conversaoValorDescontoSindicato = (valorTotalSalarioMesBruto * 5) / 100;

        double somaTotalDeDescontos = conversaoValorDescontoINSS + conversaoValorDescontoIR + conversaoValorDescontoSindicato;
        double valorSalarioLiquido = valorTotalSalarioMesBruto - somaTotalDeDescontos;


        System.out.println("IR: " + conversaoValorDescontoIR);
        System.out.println("INSS: " + conversaoValorDescontoINSS);
        System.out.println("Desconto sindicato: " + conversaoValorDescontoSindicato);

        System.out.println("O total de desconto foi de " + somaTotalDeDescontos );
        System.out.println("Seu salário líquido é " + valorSalarioLiquido);


        ///System.out.println(conversaoValorDescontoIR);

        //double conversaoDescontoImpostos;








    }
}
