package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

public class Curso {

    private String nome;
    private String horario;

    Curso(){

    }
    Curso(String nome, String horario){
        this.nome = nome;
        this.horario = horario;

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

}
