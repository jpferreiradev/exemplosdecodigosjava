package OORevisao.aula40HerancaPolimorfismo;

public class Professor extends Pessoa {


    private String departamento;
    private String nomeCurso;
    private double salario;


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

    // Sobreescrevendo método na classe Professor
    public String obterEtiquetaEndereco(){

        String s = "Endereço do professor: ";
        s += super.getEndereco();

        return s;
    }
}
