package aula17.atividades;

import java.util.Scanner;
public class atividade03 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = scan.nextInt();

        System.out.println("Digte o seu salário: ");
        salario = scan.nextDouble();

        System.out.println("Digite qual é o seu sexo: F ou M: ");
        sexo = scan.next().charAt(0);

        System.out.println("Digite o seu estado civil entre:s(solteiro) c( casado)  v( viúdo)   d(divorciado)  ");
        estadoCivil = scan.next().charAt(0);


        System.out.println("--------------");
        System.out.println("Seu nome é:" + nome);
        System.out.println("Sua idade é:" + idade);
        System.out.println("Seu salário é:" + salario);
        System.out.println("Seu sexo é:" + sexo );
        System.out.println("Seu estado civil é :" + estadoCivil);




        /*
        do{
            if(nome.length() > 3){
                System.out.println("Seu nome é:" + nome);
            } else {
                System.out.println("Digite novamente, é preciso ser maior que 3 caracteres");
            }

        } while(nome.length() > 3)
            System.out.println("Seu nome é:" + nome);

        */







    }
}

//System.out.println("Numero de caracterez: " + nome.length());