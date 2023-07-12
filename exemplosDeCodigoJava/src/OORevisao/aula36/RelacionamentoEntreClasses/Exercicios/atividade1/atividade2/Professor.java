package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.atividade2;

public class Professor {

    private String nome;
    private String departamento;
    private String email;

    Professor(String nome, String departamento,String email){
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }

    Professor(){

    }



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
