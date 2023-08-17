package OORevisao.Aula52ExceptionCriandoSuaPropriaException;

public class DivisaoNaoExata extends Exception {

    private int numero;
    private int denominador;

    DivisaoNaoExata(int numero, int denominador){
        super();
        this.numero = numero;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "Resultado de " + numero + "/" + denominador + " não é um inteiro";
    }
}
