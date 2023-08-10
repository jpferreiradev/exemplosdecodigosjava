package OORevisao.ExceptionsMultiplosCatch;

public class MultiplosCatch {
    public static void main(String[] args) {

        // Aqui é a forma que a professora fez!


        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
            } catch (ArithmeticException exception) {
                System.out.println("Pode deixar passar esse erro...");
            }

        }

    }

}






/*
    // Exemplo de vetor de String
    String  teste[] = new String[2];

         teste[0] = "Bora";
         teste[1] = "pra";
         teste[2] = "aonde?";

 */

/* // Forma que eu fiz para capturar o erro;
 try{
           int[] numeros = {4,8,16,32,64,128};
           int[] denominador = {2,0,4,8,0};

           for(int i= 0;i <numeros.length; i++){
               System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
           }

       } catch (ArithmeticException exception){
           System.out.println("Pode deixar passar esse erro!");
       }
 */