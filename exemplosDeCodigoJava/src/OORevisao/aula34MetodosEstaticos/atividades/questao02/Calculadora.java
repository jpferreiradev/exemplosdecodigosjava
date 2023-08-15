package OORevisao.aula34MetodosEstaticos.Atividades.questao02;


public class Calculadora {

    public static int somar(int numeroUm, int numeroDois) {

        return numeroUm + numeroDois;
    }

    public static int subtrair(int numeroUm, int numeroDois) {

        return numeroUm - numeroDois;
    }

    public  static int multiplicar(int numeroUm, int numeroDois) {

        return numeroUm * numeroDois;

    }

    public  static int dividir(int numeroUm, int numeroDois) {
        return numeroUm / numeroDois;
    }

    public static double elevarPotencia(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }

    public static int fatorialNumero() {

        int x = 5;
        int f = x;

        System.out.println("Os valores do cálculo factorial desse número é: ");
        while (x > 1) {
            f = f * (x - 1);
            x--;
            System.out.print(" " + f);
        }
        return f;
    }

}

