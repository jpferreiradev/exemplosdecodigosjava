package OORevisao.aula43ClasseObjetc;

public class Aluno {


    private String curso; // Array com uma dimesão;
    private double[] notas; // Array com duas dimenções;

    public Aluno(){
        super(); // Ele vai chamar o contrutor da superClass
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    public void metodoQualquer(){
        //super.setCpf("5940594059450"); // Fazendo referencia a superClass( Pessoa)
        //this.setCpf("54589454859"); // Fazendo referencia a propria classe
    }
    // Sobreescrever o método na classe Aluno
    public String obterEtiquetaEndereco(){
        String s = "Endereço do Aluno: ";
        //s += super.getEndereco();
        return s;
    }

    //@Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }

    public String toString(){
        return curso + notas;
    }



}
