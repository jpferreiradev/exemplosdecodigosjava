package OORevisao.Aula52ExceptionCriandoSuaPropriaException;

public class UsandoMinhaException {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if(numeros[i] % 2 != 0){
                    // lançar a exception aqui
                    throw new DivisaoNaoExata(numeros[i],denominadores[i]);
                    // Uso do throw new é que vai lançar essa exceção pra frente;
                }
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata exc) {
                System.out.println("Aconteceu um erro");
                exc.printStackTrace();
            }

        }
    }
}
