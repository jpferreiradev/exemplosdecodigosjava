package OORevisao.aula38HerancaChaveSuper;

public class Aluno extends Pessoa {


    private String[] cursos; // Array com uma dimesão;
    private double[][] notas; // Array com duas dimenções;


    public String[] getCursos() {
        return this.cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[][] getNotas() {
        return this.notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

}
