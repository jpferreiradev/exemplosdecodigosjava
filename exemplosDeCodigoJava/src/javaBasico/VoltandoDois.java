package javaBasico;

public class VoltandoDois {
    public static void main(String[] args) {
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna != linha; coluna++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

}