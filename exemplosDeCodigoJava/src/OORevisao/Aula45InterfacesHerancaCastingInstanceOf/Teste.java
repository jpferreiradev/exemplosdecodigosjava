package OORevisao.Aula45InterfacesHerancaCastingInstanceOf;

import org.w3c.dom.ls.LSOutput;

public class Teste {

    public static void  main(String [] args){

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if( pessoa instanceof Pessoa){ // A variavel pessoa é uma instancia da classe Pessoa
            System.out.println("É do tipo Pessoa");
        }
        if( aluno instanceof Aluno){
            System.out.println(" é do tipo Aluno");
        }
        if( professor instanceof Professor){
            System.out.println(" é do tipo Professor");
        }
    }


}


/*
 Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; // Upcasting, forma automatica

        // Upcasting manual

        //Pessoa alunoDois = new Aluno();
        //Pessoa alunoDois = (Pessoa) new Aluno(); // É o mesmo que o exemplo a cima alunoDois
        Pessoa alunoDois = (Pessoa) new Aluno(); // Esse exemplo aqui é muito utilizado nos projetos Java, principalmente no Hibernate, você verá muitos codigos assim de transformação/ casting/

        Pessoa alunoTres = new Pessoa();
        //Aluno alunoQuatro = (Aluno) alunoTres;

        //System.out.println(alunoQuatro);
 */