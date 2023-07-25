package OORevisao.aula42HerancaFinalClassConstantes;

public class ClasseTeste {
    public static void main(String[]args){


        // Exemplo 1 - Uso de classes finais
        Pessoa pessoa = new Pessoa();
        //Pessoa aluno = new Aluno();
        //Pessoa  professor = new Professor();
        // -- Nesse caso aqui não temos mais a utilização da Herança
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Exemplo 2 - Uso de constantes
        System.out.println(ExemploClasseConstante.URL_BLOG);
        System.out.println(ExemploClasseConstante.URL_CURSO_COMPLETO);

        // Como o atributo não é final, você pode moficiar o valor dela; O valor da URL_BLOG
        ExemploClasseConstante.URL_BLOG = "Estou modificando esse atributo!";
        System.out.println(ExemploClasseConstante.URL_BLOG);

        //Exemplo 3
        final int TOTAL = 1; // Nesse caso você pode modificar o valor da variavel final, e transforma em uma CONSTANTE, veja a convenção feita na variavel constante
        //total = total + 1;
        System.out.println(TOTAL);

    }
}
