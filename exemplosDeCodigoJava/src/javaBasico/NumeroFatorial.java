package javaBasico;

public class NumeroFatorial {
    public static void main(String[] args) {

        int x = 5;
        int f = x;

        System.out.println("Os valores do cálculo factorial desse número é: ");
        while(x > 1){
            f = f * (x-1);
            x--;
            System.out.print(" " + f);
        }

    }
}
