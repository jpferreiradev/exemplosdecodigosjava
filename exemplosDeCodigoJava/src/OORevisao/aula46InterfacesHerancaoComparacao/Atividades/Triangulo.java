package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Triangulo extends Figura2D implements DimensaoSuperficial{


    private double base;
    private double altura;

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {

    }
}

