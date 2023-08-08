package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Cilindro extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial{


    private double altura;
    private double raio;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularVolume() {

    }

    @Override
    public void calcularArea() {

    }
}
