package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

public class Curso {

    private String nome;
    private String horario;
    //private Aluno[] alunos;

    Curso(){

    }
    Curso(String nome, String horario, Aluno[]alunos){
        this.nome = nome;
        this.horario = horario;
        //this.alunos = alunos;
    }

    public String getNome(){
        return this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getHorario(){
        return this.horario;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }

    /*
    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
       */
}

