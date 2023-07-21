package OORevisao.aula41HerancaoClassesAbstratas.Exemplo;

public class Gato extends Mamifero{


    private String raca;

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return super.emitirSom();
    }

    @Override
    public String amamentar() {
        return super.amamentar();
    }
}
