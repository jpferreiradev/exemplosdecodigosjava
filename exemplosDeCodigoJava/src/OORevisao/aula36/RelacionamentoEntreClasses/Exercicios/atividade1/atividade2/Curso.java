package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.atividade2;

public class Curso {

    private String nome;
    private double horario;
    private Aluno aluno[];

    Curso(String nome, double horario){
        this.nome = nome;
        this.horario = horario;
    }

    Curso(String nome,double horario, Aluno[] aluno){
        this.nome = nome;
        this.horario = horario;
        this.aluno = aluno;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHorario() {
        return this.horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }
}
