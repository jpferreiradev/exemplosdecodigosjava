package aula17;

public class LoopFor {
    public static void main(String[] args) {


        // Maneira "normal" de declarar o loop for
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("i tem valor: " + i);
        }

        // Exemplo de for com mais de uma variavel

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i tem valor: " + i + " j tem valor: " + j);


        }

        // partes ausentes
        int count = 0;
        for (; count < 10; ) {
            System.out.println("i tem valor: " + count);
            count += 2; // Incrementar a cada 2
        }

        // Loop sem corpo

        int soma = 0;
        for (int i = 1; i < 5; soma += i++) ;
        System.out.println("O valor da soma é: " + soma);

        // loop sem as chaves, não é uma boa prática, usar sempre!
        for (int i = 0; i < 5; i++)
            System.out.println("i tem valor: " + i);


    }

}
