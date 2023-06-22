package OORevisao.aula34MetodosEstaticos.Atividades.questao06;

import java.util.Scanner;

public class ConversaoDeUnidadesDeTempo {

    public  static Scanner scan = new Scanner(System.in);

    static double valorMinuto = 60;
    static double valorHora = 60;
    static double valorDia = 24;
    static double valorSemana = 7;
    static double valorMes = 60;
    static double valorAno = 365.25;
    static int valorDigitado;

    public static double conversaoValorMinuto() {
        System.out.println("Digite o valor para ser convertido: ");
        valorDigitado = scan.nextInt();
        double conversao = valorMinuto * valorDigitado;
        System.out.println("Em " + valorDigitado + " minutos, vão ser " + conversao + " segundos ");

        return conversao;
    }

    public static double conversaoValorHora() {
        System.out.println("Digite o valor a ser convertido: ");
        valorDigitado = scan.nextInt();
        double conversao = valorHora * valorDigitado;
        System.out.println("Em " + valorDigitado + " horas, vão ser "+ conversao + " minutos");
        return conversao;
    }

    public static double conversaoValorDia() {
        System.out.println("Digite o valor a ser convertido: ");
        valorDigitado = scan.nextInt();
        double conversao = valorDia * valorDigitado;
        System.out.println("Em " + valorDigitado + " dias, iram ser "+ conversao + " horas");
        return conversao;
    }

    public static double conversaoValorSemana() {
        System.out.println("Digite o valor a ser convertido: ");
        valorDigitado = scan.nextInt();
        double conversao = valorSemana * valorDigitado;
        System.out.println("Em " + valorDigitado + " semana/as, iram ser "+ conversao + " dias");
        return conversao;
    }
    public static double conversaoValorMes() {
        System.out.println("Digite o valor a ser convertido: ");
        valorDigitado = scan.nextInt();
        double conversao = valorMes * valorDigitado;
        System.out.println("Em " + valorDigitado + " mês, iram ser "+ conversao + " dias");
        return conversao;
    }
    public static double conversaoValorAno() {
        System.out.println("Digite o valor a ser convertido: ");
        valorDigitado = scan.nextInt();
        double conversao = valorAno * valorDigitado;
        System.out.println("Em " + valorDigitado + " ano/anos, iram ser "+ conversao + " dias");
        return conversao;
    }

}




