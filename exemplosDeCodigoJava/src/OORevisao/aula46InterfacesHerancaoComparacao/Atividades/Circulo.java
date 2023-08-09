package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Circulo extends Figura2D{

    private double raio;

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
    }
}
