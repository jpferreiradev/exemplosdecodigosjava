package OORevisao.aula33.SobrecargaMetodosConstrutores.questao03;

import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

            System.out.println("Digite o seu nome: ");
            aluno.setNome(scan.nextLine());
            System.out.println("Informe a sua matrícula: ");
            aluno.setMatricula(scan.nextLine());
            System.out.println("Informe o nome do seu curso:");
            aluno.setNomeCurso(scan.nextLine());

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Digite o nome da disciplina: ");
            aluno.setNomeDisciplinaPosicao(i, scan.next());
        }
        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas().length; j++) {
                System.out.println("Entre com a nota: " + (j + 1));
                aluno.setNotasDisciplinasPosicaoIJ(i, j, scan.nextDouble());
            }
        }

        for(int i = 0; i < aluno.getNomeDisciplinas().length;i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " + aluno.getNomeDisciplinas()[i] + " foi aprovado.");
            } else {
                System.out.println("Disciplina: " + aluno.getNotasDisciplinas()[i]+ " reprovado");
            }
        }
    }
}
