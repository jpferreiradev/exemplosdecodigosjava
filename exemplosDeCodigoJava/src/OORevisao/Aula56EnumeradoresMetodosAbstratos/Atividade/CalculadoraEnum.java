package OORevisao.Aula56EnumeradoresMetodosAbstratos.Atividade;

public enum CalculadoraEnum {

    SOMA("+"),SUBTRAIR("-"),MULTIPLICAR("*"),DIVIDIR("/");


    private String simbulo;

    CalculadoraEnum(String simbulo){
        this.simbulo = simbulo;
    }

    public String getSimbulo(){
        return this.simbulo;
    }

    @Override
    public String toString() {
        return "CalculadoraEnum{" +
                "simbulo='" + simbulo + '\'' +
                '}';
    }

    //public abstract double executarOperacao();
}
