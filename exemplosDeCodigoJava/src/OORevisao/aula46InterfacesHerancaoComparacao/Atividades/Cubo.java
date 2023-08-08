package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Cubo extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial{


    private double lado;

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularVolume() {

    }

    @Override
    public void calcularArea() {

    }
}
