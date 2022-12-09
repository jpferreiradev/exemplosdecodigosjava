package todasAtividadesDaCarreira;
import java.text.DecimalFormat;
import java.util.Scanner;
public class questaoDez {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        System.out.println("Informe a temperatura em graus Celsius: ");
        double valorTemperaturaCelsius = scan.nextDouble();
        System.out.println("O valor da temperatura em graus Celsius é: " + valorTemperaturaCelsius);

        double conversaoCelsiusEmFirenheit = (valorTemperaturaCelsius * 1.8) + 32;
        System.out.println(conversaoCelsiusEmFirenheit);
        System.out.println(df.format(conversaoCelsiusEmFirenheit));
    }
}
