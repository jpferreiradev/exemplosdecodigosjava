package OORevisao.Aula44Interfaces;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

    private String raca;


    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    @Override
    public String emitirSom() {
        String s = "Gato miando";
        return s;
    }

    @Override
    public String amamentar() {
        String s = "Gato amamentando";
        return s;
    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brinca() {

    }

    @Override
    public void levarPassear() {

    }
}
