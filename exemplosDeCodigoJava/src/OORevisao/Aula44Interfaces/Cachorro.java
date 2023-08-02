package OORevisao.Aula44Interfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{ // Utilizando herança usamos [extends] e utilizando uma interface usamos [implements]

    private String tamanho;
    private String raca;

    Cachorro() {

    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        String s = "Cachorro latindo";
        return s;
    }

    @Override
    public String amamentar() {
        String s = "Cachorro amamentando";
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
