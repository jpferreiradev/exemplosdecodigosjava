package OORevisao.Aula44Interfaces;

public class Papagaio extends Ave{

    @Override
    public String emitirSom() {
        String s = "Ave emitindo som";
        return s;
    }

    @Override
    public String voar() {
        String s = "Ave voando!";
        return s;
    }
}
