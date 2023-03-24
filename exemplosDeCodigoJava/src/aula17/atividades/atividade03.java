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
        boolean infoValida = true; // Exemplo de flag









        //sexo = scan.next().charAt(0);


        //estadoCivil = scan.next().charAt(0); // Você queria ter utilizado a variavel char


        infoValida = false;
        do {
            System.out.println("Digite o seu nome: ");
            nome = scan.nextLine();

            if (nome.length() >= 3) {
                System.out.println("Seu nome é:" + nome);
                infoValida = true;
            } else {
                System.out.println("Digite novamente, é preciso ser maior que 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;
        do {

            System.out.println("Digite a sua idade: ");
            idade = scan.nextInt();
            if (idade > 0 && idade < 150) {
                System.out.println("Sua idade é:" + idade + " anos");
                infoValida = true;
            } else {
                System.out.println("Idade não permitida, digite novamente...");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digte o seu salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                System.out.println("Seu salário é: R$" + salario + " reais");
                infoValida = true;
            } else {
                System.out.println("Salário incompátivel,digite novamente... ");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Digite qual é o seu sexo: F ou M: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("F")) {
                System.out.println("Seu sexo é feminino");
                infoValida = true;
            } else if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("M")) {
                System.out.println("Seu sexo é masculino");
                infoValida = true;
            } else {
                System.out.println("Opção errada, digite novamente...");
            }
        } while (!infoValida);

        infoValida = false;
        do {

            System.out.println("Digite o seu estado civil entre:s(solteiro) c( casado)  v( viúdo)   d(divorciado)  ");
            estadoCivil = scan.next();

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
            infoValida = true;
        } while (!infoValida);
    }

}


//System.out.println("Numero de caracterez: " + nome.length());

// Maneira que Loiane fez:
// -> Ela colocou o uso das flags, em todas as validações. Sera que essa é a melhor forma?


//System.out.println("--------------");
//System.out.println("Seu nome é:" + nome);
//System.out.println("Sua idade é:" + idade + " anos");
//System.out.println("Seu salário é: R$" + salario + " reais");
//System.out.println("Seu sexo é:" + sexo );
//System.out.println("Seu estado civil é :" + estadoCivil);