package OORevisao.aula35.Recursividade.Atividades;

public class QuestaoUmCorrigida {


    private final static int TAMANHO_MEMORIA = 50;
    private static long[] memoria = new long[TAMANHO_MEMORIA];

    public static long fibonacci(int numero) {
        if (numero < 2){
            return memoria[numero];
        }


        long fib = memoria[numero];
        if (fib  == 0){
            fib = fibonacci(numero-1) + fibonacci(numero-2);
            memoria[numero] = fib;
        }

        return memoria[numero];
    }

    public static void main(String[] args){

        memoria[0] = 0;
        memoria[1] = 1;

        for(int i = 1; i < TAMANHO_MEMORIA; i++){
            System.out.println("Fibonacci de " + i + ":" + fibonacci(i));
        }

    }
}











// Foi sugerido na correção do exercicio cria um vetor para que pudesse ficar gravado como se fosse um cash, os numeros
// que já foram utilizados;