package OORevisao.aula35.Recursividade;

public class Calculadora {


    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static int soma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    public static int soma(int[] vetorInteiros) {
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            total += vetorInteiros[i];
        }
        return total;
    }

    // 5! = 5 * 4  * 3 * 2 * 1 = 120;
    //0! = 1;
    public static int fatorialNaoRecursivo(int num) {

        if (num == 0) {
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    // fatorial(5) = 5 * fatorial(4)
    // fatorial(4) = 4 * fatorial(3)
    // fatorial(3) = 3 * fatorial(2)
    // fatorial(2) = 2 * fatorial(1)
    // fatorial(1 ) = 1 * fatorial(0)
    // fatorial(0) = 1;
    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);

    }


}
