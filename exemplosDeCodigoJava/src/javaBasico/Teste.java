package javaBasico;

public class Teste {
    public static void main(String args[]){

        int N = Integer.parseInt(args[0]);
        int v = 1;


        while (v<=N/2) {
            v = v * 2;
        }

        while (v > 0) {
            if (N < v) {System.out.println(0);
            } else {
                System.out.println(1);
                N=N-v;
            }
        } v=v/2;
        System.out.println();
    }
    }

