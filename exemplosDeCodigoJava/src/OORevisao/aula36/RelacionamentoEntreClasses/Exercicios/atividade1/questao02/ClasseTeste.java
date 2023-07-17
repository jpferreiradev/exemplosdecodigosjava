package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

import java.util.Scanner;

public class ClasseTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do curso:");
        String nome = scan.nextLine();

        System.out.println("Digite com o horário do curso:");
        String horario = scan.nextLine();

        System.out.println("Digite o nome do professor:");
        String nomeProfessor = scan.nextLine();

        System.out.println("Digite o nome do departamento do professor");
        String departamento = scan.nextLine();

        System.out.println("Digite o email do professor");
        String emailProfessor = scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNomeProfessor(nomeProfessor);
        professor.setDepartamento(departamento);
        professor.setEmail(emailProfessor);

        curso.setProfessor(professor);

        System.out.println("-----Alunos-----");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {

            scan.nextLine();
            System.out.println("Entre com o nome do aluno " + (i + 1));
            String nomeAluno = scan.nextLine();

            System.out.println("Entre com a matricula do ano");
            String matriculaAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {
                System.out.println("Entre com a nota: " + (j + 1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}

/*

        Curso cursoUm = new Curso();

        Aluno[] aluno = new Aluno[5];
        for(int i = 0; i < 5;i++){

         System.out.println("Informe a primeira nota: " + (i + 1));

 */