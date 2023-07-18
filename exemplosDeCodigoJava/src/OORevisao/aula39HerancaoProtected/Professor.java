package OORevisao.aula39HerancaoProtected;

public class Professor extends Pessoa {


    private String departamento;
    private String nomeCurso;
    private double salario;

    public void verificarAcesso(){
        this.nomeVisibilidade = "fdfgerfef";
        super.nomeVisibilidade = "fjeifjeifj";

        super.setNomeVisibilidade("jeifjefij");
        this.setNomeVisibilidade("gjrigjrgirj");
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalarioLiquido() {
        return 0;
    }
}
