package OORevisao.aula41HerancaoClassesAbstratas.Exemplo;

public class Cachorro extends Mamifero {

    private String raca;
    private String tamanho;

    public String getRaca(){
        return this.raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
