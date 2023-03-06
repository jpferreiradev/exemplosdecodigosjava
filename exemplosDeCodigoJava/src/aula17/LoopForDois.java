package aula17;


import java.util.Scanner;

public class LoopForDois {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número desejado :");
        int num = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            int r = num * i;
            System.out.println(num + " * " + i + " = " + r);

        }



    }
}

