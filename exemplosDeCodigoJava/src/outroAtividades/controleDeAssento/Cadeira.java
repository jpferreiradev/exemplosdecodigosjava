package outroAtividades.controleDeAssento;

public class Cadeira extends Cliente {

    private int assento;
    private int fileira;

    public Cadeira(int assento, int fileira) {
        this.assento = assento;
        this.fileira = fileira;

    }

    public int getAssento() {
        return this.assento;
    }

    public void setAssento(int assento) {
        this.assento = assento;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public void reservaAssento() {
        this.fileira++;
        this.assento++;
        this.cpf++;
        System.out.println("Reserva feita com sucesso!");

    }

    public void cancelaAssento() {
        this.cpf--;

    }


}
