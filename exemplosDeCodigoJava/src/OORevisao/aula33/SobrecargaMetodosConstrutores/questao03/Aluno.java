package OORevisao.aula33.SobrecargaMetodosConstrutores.questao03;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;



    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3]; // O tamanho do array é dentro do construtor, essa forma foi feita!
        this.notasDisciplinas = new double[3][4]; // O tamanho do array é dentro do construtor, essa forma foi feita!

    }


    public Aluno() {
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
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


    public void cadastro() {

        System.out.println("Nome:" + getNome());
        System.out.println("Matricula:" + getMatricula());
        System.out.println("Nome do curso:" + getNomeCurso());


        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j]);
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice) {

        double soma = 0;

        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

    private double obterMedia(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }

    public void setNomeDisciplinaPosicao(int pos, String nomeDisciplina) {
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotasDisciplinasPosicaoIJ(int posI, int posJ, double nota) {
        this.notasDisciplinas[posI][posJ] = nota;
    }

}



