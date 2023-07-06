package exceptionJava;

public class MultiplosCatchJava7 {
    public static void main(String[] args) {

        int [] numeros = {4,8,16,32,64,128};
        int[] denominadores = {2,0,4,8,0};

        for(int i = 0; i<numeros.length; i++){
            try {
                System.out.println(numeros[i]+ "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            }
            catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
                System.out.println("Aconteceu um erro");
            }
        }
    }
}
