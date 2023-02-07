package aula15.atividades;

import java.util.Scanner;

public class questaoQuatro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite uma letra");
        String letra = scan.nextLine();


        switch(letra) {
            case "a":
                System.out.println("Vogal");
                break;
            case "e":
                System.out.println("Vogal");
                break;
            case "i":
                System.out.println("Vogal");
                break;
            case "o":
                System.out.println("Vogal");
                break;
            case "u":
                System.out.println("Vogal");
                break;
            default:System.out.println("É uma consoante");
        }
        }

}

