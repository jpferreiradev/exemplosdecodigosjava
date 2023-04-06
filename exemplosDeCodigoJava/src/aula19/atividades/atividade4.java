package aula19.atividades;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a[] = new int[15];
        int b[] = new int[a.length];

        for(int i = 0;i < a.length;i++){
            System.out.println("Digite um valor na posição: " + i );
            a[i] = scan.nextInt();
            b[i] = Math.sqrt(a[i]);

        }



    }
}
