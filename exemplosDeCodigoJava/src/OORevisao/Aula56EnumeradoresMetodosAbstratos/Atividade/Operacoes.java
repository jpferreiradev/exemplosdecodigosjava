package OORevisao.Aula56EnumeradoresMetodosAbstratos.Atividade;

public enum Operacoes {

    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            //double valor = x + y;
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            //double valor = x - y;
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            //double valor = x * y;
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            //double valor = x / y;
            return x / y;
        }
    };

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
        //return "O símbulo é esse: " + this.simbulo;
        return this.simbulo;

    }

    public abstract double executarOperacao(double x, double y);
}
