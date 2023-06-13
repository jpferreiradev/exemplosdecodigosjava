package OORevisao.aula33.SobrecargaMetodosConstrutores.questao03;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    Scanner scan = new Scanner(System.in);

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3]; // O tamanho do array é dentro do construtor, essa forma foi feita!
        this.notasDisciplinas = new double[3][4]; //  // O tamanho do array é dentro do construtor, essa forma foi feita!

    }


    public Aluno(String nome, String nomeCurso) {
        this.nome = nome;
        this.nomeCurso = nomeCurso;
    }

    public Aluno() {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    // Exemplo de como se criar o metodos get e set com arrays
    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
    // Termina aqui!

    void cadastro(){
        System.out.println("Informe o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Informe o nome do seu curso: ");
        nomeCurso = scan.nextLine();
        System.out.println("Seu nome é : " + getNome() + " e o nome do seu curso é:" + getNomeCurso());
    }


}
