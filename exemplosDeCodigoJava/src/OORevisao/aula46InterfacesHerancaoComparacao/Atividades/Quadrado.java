package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class Quadrado extends Figura2D {

    private double lado;

    public double getLado(){
        return this.lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;

    }
}
