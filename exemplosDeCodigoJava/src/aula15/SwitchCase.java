package aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite de 1 a 7");
        int diasSemana = scan.nextInt();

        /*
        // Primeiro exemplo com if
        if( diasSemana == 1){
            System.out.println("Domingo");
        } else if (diasSemana == 2) {
            System.out.println("Segunda- feira");
        } else if (diasSemana == 3) {
            System.out.println("Terça-feira");
        } else if(diasSemana == 4){
            System.out.println("Quarta-feira");
        } else if(diasSemana == 5){
            System.out.println("Quinta-feira");
        } else if(diasSemana == 6) {
            System.out.println("Sexta-feira");
        } else if(diasSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Não é um número válido");
        }


        // Exemplo 2 - Com switch
        switch (diasSemana){
            case 1:System.out.println("Domingo");break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça");break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sábado");break;
            default:System.out.println("Não é um número da semana válido");
        }
        /*

        // Exemplo 3 - Com switchCase
         */
        switch(diasSemana){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Dia útil"); break;
            case 1:
            case 7: System.out.println("Fim de semana"); break;
            default: System.out.println("Não é um dia de semana válido");
        }

    }
}
