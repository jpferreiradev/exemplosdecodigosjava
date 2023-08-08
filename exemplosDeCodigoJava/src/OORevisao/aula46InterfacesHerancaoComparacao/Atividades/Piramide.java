package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Piramide extends Figura3D implements DimensaoVolumetrica, DimensaoSuperficial{

    private double altura;
    private double area;
    private double apotema;

    private Figura2D base;

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getApotema() {
        return this.apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return this.base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public void calcularVolume() {

    }

    @Override
    public void calcularArea() {

    }
}
