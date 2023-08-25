package OORevisao.Aula56EnumeradoresMetodosAbstratos.Atividade;

public enum Operacoes {

    SOMAR("+"), SUBTRAIR("-"), MULTIPLICAR("*"), DIVIDIR("/");

    private String simbulo;

    Operacoes(String simbulo) {
        this.simbulo = simbulo;
    }

    public String getSimbulo() {
        return this.simbulo;
    }

    public void setSimbulo(String simbulo) {
        this.simbulo = simbulo;
    }

    @Override
    public String toString() {
        return "O símbulo é esse: " + simbulo;

    }

    public abstract double executarOperacao(double x, double y);
}
