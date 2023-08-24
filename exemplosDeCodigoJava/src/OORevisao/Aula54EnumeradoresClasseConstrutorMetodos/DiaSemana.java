package OORevisao.Aula54EnumeradoresClasseConstrutorMetodos;

public enum DiaSemana {

    // Enumerador parecida com uma classe;

    SEGUNDA(1),TERÇA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);
    // Aqui temos os enumadores com construtores, com o parametro recebendo um inteiro;

    private int valor;

     DiaSemana(int valor){  // Não é utilizado nenhum moficador de acesso na criação do construtor nos enus;
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }

}

// Construção do construtor sem os modificadores de acesso
// Construção dos métodos