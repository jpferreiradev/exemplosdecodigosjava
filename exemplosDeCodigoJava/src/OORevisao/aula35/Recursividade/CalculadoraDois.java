package OORevisao.aula35.Recursividade;

public class CalculadoraDois {



    // Método não recursivo
    public static int calculaFatorial(int numero){

        if(numero == 0){
            return 1;
        }

        int total = 1;
        for(int i = numero; i > 1; i--){
            total *= i;
        }
        return total;
    }
    // Método recursivo
    public static int fatorial(int numero){
        if(numero == 0){
            return 1;
        }
        return numero * fatorial(numero -1);
    }
}
