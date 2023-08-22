package OORevisao.Aula54EnumeradoresClasseConstrutorMetodos;

public enum DiaSemana {

    SEGUNDA(1), TERÇA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    // Construção do construtor sem os modificadores de acesso
    DiaSemana(int valor){
        this.valor = valor;
    }

    // Construção dos métodos
    public int getValor(){
        return this.valor;
    }



}
