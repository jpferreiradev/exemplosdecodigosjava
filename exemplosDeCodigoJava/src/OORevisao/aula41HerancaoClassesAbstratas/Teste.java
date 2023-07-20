package OORevisao.aula41HerancaoClassesAbstratas;

public class Teste {
    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa(); // Quando a classe é abstrata, você não pode instanciar essa tipo de classe
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //pessoa.setEndereco("Rua 1, numero 1");
        aluno.setEndereco("Rua 2, numero 2");
        professor.setEndereco("Rua 3,numero 3 ");

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
    }
}
