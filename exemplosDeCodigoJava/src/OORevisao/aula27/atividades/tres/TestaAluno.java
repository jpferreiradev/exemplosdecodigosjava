package OORevisao.aula27.atividades.tres;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno primeiroAluno = new Aluno();


        primeiroAluno.disciplinas = new String[3];
        primeiroAluno.disciplinas[0] = "Lógica de programação";
        primeiroAluno.disciplinas[1] = "POO com Java";
        primeiroAluno.disciplinas[2] = " Estrutura de dados";

        //System.out.println( primeiroAluno.disciplinas[0]);
        //System.out.println( primeiroAluno.disciplinas[1]);
        //System.out.println( primeiroAluno.disciplinas[2]);














    }
}

/*
 primeiroAluno.disciplinas = new String[3];
        //segundoAluno.disciplinas = new String[2];
        //primeiroAluno.notas = new double[2][];

        System.out.println("Informe o nome das disciplinas:");
        primeiroAluno.disciplinas[0] = scan.nextLine();
        primeiroAluno.disciplinas[1] = scan.nextLine();
        primeiroAluno.disciplinas[2] = scan.nextLine();

        System.out.println(primeiroAluno.disciplinas[0]);
        System.out.println(primeiroAluno.disciplinas[1]);
        System.out.println(primeiroAluno.disciplinas[2]);


 */