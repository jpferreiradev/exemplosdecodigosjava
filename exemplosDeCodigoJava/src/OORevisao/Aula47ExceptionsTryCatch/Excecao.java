package OORevisao.Aula47ExceptionsTryCatch;

public class Excecao {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1; // Aqui acontece a exception

            System.out.println("Esse texto não sera impresso");


        } catch ( ArrayIndexOutOfBoundsException exception) { // Exemplo de tratamento do erro
            System.out.println("Exceção ao acessar um índice do vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");
    }
}
