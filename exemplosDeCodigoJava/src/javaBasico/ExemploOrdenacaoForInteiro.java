package javaBasico;

public class ExemploOrdenacaoForInteiro {
    public static void main(String[] args) {

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna != linha; coluna++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

}