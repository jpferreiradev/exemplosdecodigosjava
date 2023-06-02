package OORevisao.aula27.atividades.tres;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno primeiroAluno = new Aluno();
        Aluno segundoAluno = new Aluno();


        //primeiroAluno.cadastrarAluno();
        //segundoAluno.cadastrarAluno();

        primeiroAluno.disciplinas = new String[3];
        //segundoAluno.disciplinas = new String[2];
        //primeiroAluno.notas = new double[2][];

        System.out.println("Digite o nome das disciplinas:");
        primeiroAluno.disciplinas[0] = scan.nextLine();
        primeiroAluno.disciplinas[1] = scan.nextLine();
        primeiroAluno.disciplinas[2] = scan.nextLine();

        System.out.println(primeiroAluno.disciplinas[0]);
        System.out.println(primeiroAluno.disciplinas[1]);
        System.out.println(primeiroAluno.disciplinas[2]);

        //contatoUm.telefones[0] = "9904743";




    }
}
