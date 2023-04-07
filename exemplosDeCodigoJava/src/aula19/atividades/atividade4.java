package aula19.atividades;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a[] = new int[15];
        int b[] = new int[a.length];
        double vetor[] = new double[a.length];

        for(int i = 0;i < a.length;i++){
            System.out.println("Digite um valor na posição: " + i );
            a[i] = scan.nextInt();
            vetor[i] = Math.sqrt(a[i]);
        }

        for(int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

/*
        int myInt = 9;
        double myDouble = myInt;

 */