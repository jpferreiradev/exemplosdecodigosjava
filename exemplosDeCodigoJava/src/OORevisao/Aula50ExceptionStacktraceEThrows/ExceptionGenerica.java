package OORevisao.Aula50ExceptionStacktraceEThrows;

public class ExceptionGenerica {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {

            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
            } catch (Exception e) {
                // Os dois métodos mais usados são os getMessage e o printStacktrace
                System.out.println(e.getMessage()); //
                e.printStackTrace(); //Descobrir aonde aconteceu o erro;


            }

        }
    }

}