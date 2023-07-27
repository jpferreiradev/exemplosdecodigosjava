package ClassesImportantesEOutros;

import java.text.DecimalFormat;

public class ClasseDecimalFormat {
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");

        double numeroTeste = 5.000;
        System.out.println(df.format(numeroTeste));


    }
}
