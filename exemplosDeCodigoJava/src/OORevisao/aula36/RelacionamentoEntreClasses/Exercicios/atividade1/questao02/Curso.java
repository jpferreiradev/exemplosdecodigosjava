package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

public class Curso {

    private String nome;
    private String horario;
    private Aluno[] alunos;
    private Professor professor;

    Curso() {

    }

    Curso(String nome, String horario, Aluno[] alunos) {
        this.nome = nome;
        this.horario = horario;
        //this.alunos = alunos;
    }

    public String getNome() {
        return this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String obterInfo() {

        String info = "Nome do curso = " + nome + "/n";

        if(professor != null){
            info += professor.obterInfo();
        }
        if(alunos != null){
            System.out.println("----Alunos----");
            for( Aluno aluno : alunos){
                if(aluno != null){
                    info += aluno.obterInfo();
                    info += "\n";
                }
            }
            info += "\nMédia da turma = " + obterMediaTurma();
        }
    return info;
    }

    public double obterMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                soma += aluno.obterMedia();
            }
        }
        return soma / alunos.length;
    }

}





