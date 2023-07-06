package aula15.atividades;

import java.util.Scanner;
public class questaoTres {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra entre f ou m");
        String sexo = scan.nextLine();


        if(sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo masculino");
        } else if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Sexo feminino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
