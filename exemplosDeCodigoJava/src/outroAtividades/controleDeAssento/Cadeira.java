package outroAtividades.controleDeAssento;

public class Cadeira {

    private int assento;
    private int fileira;

    Cadeira(int assento, int fileira){
         this.assento = assento;
         this.fileira = fileira;
    }

    public int getAssento(){
        return this.assento;
    }

    public void setAssento(int assento){
        this.assento = assento;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira){
        this.fileira = fileira;
    }
}
