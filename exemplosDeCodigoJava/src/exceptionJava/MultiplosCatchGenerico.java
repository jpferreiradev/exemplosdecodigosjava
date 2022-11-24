package exceptionJava;

public class MultiplosCatchGenerico {
    public static void main(String[] args) {

        int [] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for(int i = 0; i<numeros.length; i++){
            try {
                System.out.println(numeros[i]+ "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            }
            catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero");

            }
            catch (Throwable e){ // Não usar essa classe, e sim usar a classe Exception quando for uma uma exceção generica
                System.out.println("Ocorreu um erro");

            }

        }
    }
}
