package OORevisao.aula42HerancaFinalClassConstantes;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno(); - Não temos mais a herança aqui
        //Pessoa professor = new Professor();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // exemplo 02
        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "Pode colocar o que quiser, ela não usa o final ";
        System.out.println(Constantes.URL_BLOG);

        final int TOTAL = 1;
        //final total = total = 1;
        System.out.println(TOTAL);

    }
}

