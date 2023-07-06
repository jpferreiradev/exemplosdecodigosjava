package todasAtividadesDaCarreira;
import java.util.Scanner;
import java.text.DecimalFormat;

public class questaoNove {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");

        System.out.println("Informe a temperatura em Farenheit: ");
        double temperaturaEmFarenheit = scan.nextDouble();

        double conversaoFarenheitEmCelsius = ((temperaturaEmFarenheit - 32) * 5) / 9;
        System.out.println(df.format(conversaoFarenheitEmCelsius));
        //System.out.println(conversaoFarenheitEmCelsius);
    }
}
