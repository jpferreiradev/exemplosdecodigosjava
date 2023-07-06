<<<<<<< HEAD
package OORevisao.aula35.Recursividade.OutrosExemplos;

public class Um {
    private static int recursivdade(int number) {
        if (number == 1) {
            return 1; // Aqui é o ponto de parada, ele returna 1;
        }

        return number * recursivdade(number - 1);
    }

    private static void fatorial(int number) {
        int total = 1;
        for (int i = number; i > 1; i--) {
            total = total * i;
        }
        System.out.println(total);
    }

    //private static int recursividade(int number) {

    //}
}
=======
package OORevisao.aula35.Recursividade.OutrosExemplos;

public class Um {
    private static int recursivdade(int number) {
        if (number == 1) {
            return 1; // Aqui é o ponto de parada, ele returna 1;
        }

        return number * recursivdade(number - 1);
    }

    private static void fatorial(int number) {
        int total = 1;
        for (int i = number; i > 1; i--) {
            total = total * i;
        }
        System.out.println(total);
    }

    //private static int recursividade(int number) {

    //}
}
>>>>>>> main
