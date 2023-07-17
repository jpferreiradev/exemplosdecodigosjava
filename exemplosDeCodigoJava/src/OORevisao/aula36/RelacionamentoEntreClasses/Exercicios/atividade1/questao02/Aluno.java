package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas; // Primeiro erro

    Aluno() {

    }

    Aluno(String nome, String matricula, double[] nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = nota;
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

    public double[] getNotas() {
        return this.notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String obterInfo() {

        String info = "Nome Aluno" + nome + ";";
        info += "Matricula = " + matricula + ";";
        info += "Notas: ";

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            info += nota + " ";
        }

        double media = soma / 4;
        info += "\n" + "Média = " + media + " ";
        if( media >= 7){
            info += "Aprovado";
        } else {
            info += "Reprovado";
        }

        return info;
    }
    public double obterMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma /4;
    }

}


 /*
    public void valorMedia(){
        if( >= 7){
            System.out.println("Parabéns, você foi aprovado");
        } else {
            System.out.println("Você foi reprovado");
        }

    }
    */