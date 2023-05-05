package ClassesImportantesEOutros;

import java.util.Random;

public class ClasseRandom {
    public static void main(String[] args) {

        // Essa classe permite que você gere números aleátorios int e double/float
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(30);
        double valorDois = aleatorio.nextDouble(30);

        System.out.println("Numero gerado: " + valor);
        System.out.println("Numero gerado: " + valorDois);

    }
}
