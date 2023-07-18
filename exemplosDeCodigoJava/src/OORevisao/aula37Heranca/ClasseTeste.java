package OORevisao.aula37Heranca;

public class ClasseTeste {
    public static void main(String[] args) {

        /*
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        Pessoa pessoa = new Pessoa();

        aluno.setNome("João");
        //professor.g
        */


        // Um outro exemplo de como usar a herança de outra maneira;

        // Pessoa é uma superclasse da classe Aluno
        Pessoa aluno = new Aluno();
        //aluno.get

        // Nesse exemplo não temos como utlilizar os atributos/metodos da classe Professor, porque declaramos a superclass e não a classe Professor
        // superclass " Pessoa";
        Pessoa professor = new Professor();
        //professor.get
    }
}
