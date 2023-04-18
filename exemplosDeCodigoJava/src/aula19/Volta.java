package aula19;
import java.util.Scanner;
public class Volta {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[3];
        int vetorB[] = new int[vetorA.length];


        for(int i = 0; i < args.length; i++){
            System.out.println("Digite uma posição: ");
            vetorA[i] = scan.nextInt();


        }

    }
}
