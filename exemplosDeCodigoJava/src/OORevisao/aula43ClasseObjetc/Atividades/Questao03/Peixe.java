package OORevisao.aula43ClasseObjetc.Atividades.Questao03;

public class Peixe extends Animal {

    private String caracteristicas;

    Peixe() {
        super();
        super.setPatas(0);
        super.setAmbiente("Mar");
        super.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";

    }

    public String getCaracteristicas() {
        return this.caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Caracteristicas: " + caracteristicas;
        return s;
    }
}
