package OORevisao.aula43ClasseObjetc.Atividades.Questao02;

public abstract class Contribuinte {

    private String nome;
    private double rendaBruta;


    Contribuinte() {

    }

    Contribuinte(String nome, double rendaBruta) {
        super();
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return this.rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    // Faltou a criação desse método
    public abstract double calcularImposto();

    // Faltou criar o método toString
    @Override
    public String toString() {
        String s = "Nome: " + nome + "\n";
        s += "Renda Bruta: " + rendaBruta + "\n" ;
        return s;
    }
}
