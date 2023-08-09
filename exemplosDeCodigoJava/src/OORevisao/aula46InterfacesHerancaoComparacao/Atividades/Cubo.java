package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Cubo extends Figura3D {


    private double lado;

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
    }

    @Override
    public double calcularVolume() {
        return lado * lado * lado;
    }
}
