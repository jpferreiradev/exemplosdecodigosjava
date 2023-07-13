package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1.questao02;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas; // Primeiro erro

    Aluno(){

    }
    Aluno(String nome,String matricula,double[] nota){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = nota;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
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