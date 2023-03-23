package aula17.atividades;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;


        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = scan.nextInt();

        System.out.println("Digte o seu salário: ");
        salario = scan.nextDouble();


        System.out.println("Digite qual é o seu sexo: F ou M: ");
        sexo = scan.next();

        //sexo = scan.next().charAt(0);

        System.out.println("Digite o seu estado civil entre:s(solteiro) c( casado)  v( viúdo)   d(divorciado)  ");
        estadoCivil = scan.next();
        //estadoCivil = scan.next().charAt(0); // Você tinha utilizado a variavel char


        //System.out.println("--------------");
        //System.out.println("Seu nome é:" + nome);
        //System.out.println("Sua idade é:" + idade + " anos");
        //System.out.println("Seu salário é: R$" + salario + " reais");
        //System.out.println("Seu sexo é:" + sexo );
        //System.out.println("Seu estado civil é :" + estadoCivil);


        if (nome.length() >= 3) {
            System.out.println("Seu nome é:" + nome);
        } else {
            System.out.println("Digite novamente, é preciso ser maior que 3 caracteres");
        }
        if (idade > 0 && idade < 150) {
            System.out.println("Sua idade é:" + idade + " anos");
        } else {
            System.out.println("Idade não permitida, digite novamente...");
        }
        if (salario > 0) {
            System.out.println("Seu salário é: R$" + salario + " reais");
        } else {
            System.out.println("Salário incompátivel,digite novamente... ");
        }

        if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("F")) {
            System.out.println("Seu sexo é feminino");
        } else if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("M")) {
            System.out.println("Seu sexo é masculino");
        } else {
            System.out.println("Opção errada, digite novamente...");
        }

        switch (estadoCivil) {
            case "s":
            case "S":
                System.out.println("Estado civil: Solteiro");
                break;
            case "c":
            case "C":
                System.out.println("Estado civil: Casado");
                break;
            case "v":
            case "V":
                System.out.println("Estado civil: Viúvo");
                break;
            case "d":
            case "D":
                System.out.println("Estado civil: Divorviado");
                break;

            default:
                System.out.println("Estado civil inválido");
        }


    }

}


//System.out.println("Numero de caracterez: " + nome.length());