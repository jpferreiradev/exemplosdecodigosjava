package OORevisao.aula27.atividades.tres.questaofeita;

import java.util.Scanner;

public class TestaAlunoFeita {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno:");
        aluno.nome = scan.next();

        System.out.println("Digite o nome do curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Digite a matrícula:: ");
        aluno.matricula = scan.next();

        //aluno.nomeDisciplinas = new String [3];
        // For para pegar o nome das disciplinas
        for( int i = 0; i < aluno.nomeDisciplinas.length;i++){
            System.out.println("Digite o nome da disciplina" + i);
            aluno.nomeDisciplinas[i] = scan.next();
        }
        // For criado para pegar a posição da nota e a nota
        for(int i = 0; i < aluno.notasDisciplinas.length;i++){
            System.out.println("Obtendo notas da disciplina" + aluno.nomeDisciplinas[i]);
            for(int j = 0; j < aluno.notasDisciplinas[j].length;j++ ){
                System.out.println("Digite as notas" + (j + 1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostraInfo();

        // For para verificar se o aluno foi aprovaod ou reprovado
        for( int i = 0; i < aluno.notasDisciplinas.length; i++){
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " + aluno.nomeDisciplinas[i] + " foi aprovado");
            } else {
                System.out.println("Disciplina: " + aluno.nomeDisciplinas[i]+ " foi reprovado");
            }
        }
    }
}
