package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

public class Professor {

    private String nomeProfessor;
    private String departamento;
    private String email;

    Professor(){

    }
    Professor(String nome, String departamento, String email){
        this.nomeProfessor = nome;
        this.departamento = nome;
        this.email = email;
    }

    public String getNomeProfessor(){
        return this.nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public String getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String obterInfo(){
        return "Professor = " + nomeProfessor;
    }
}
