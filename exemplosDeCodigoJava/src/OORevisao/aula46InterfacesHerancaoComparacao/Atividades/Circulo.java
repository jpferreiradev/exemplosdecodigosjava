package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Circulo extends Figura2D implements DimensaoSuperficial{

    private double raio;

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {

    }
}
