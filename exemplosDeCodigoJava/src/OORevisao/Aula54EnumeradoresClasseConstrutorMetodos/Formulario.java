package OORevisao.Aula54EnumeradoresClasseConstrutorMetodos;

public class Formulario {

    // Exemplo de uma classe com um enu dentro dela;

    enum Genero{ // Criação do Enu dentro de uma classe;
        FEMININO('F'), MASCULINO('M'); // Exemplo que teria dentro de um formulario;

        private char valor; // Atributo
        Genero(char valor){ //Construtor
            this.valor = valor;
        }
    }


    private String nome;
    private Genero genero;
}
