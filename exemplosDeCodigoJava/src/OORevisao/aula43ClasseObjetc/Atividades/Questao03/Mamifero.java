package OORevisao.aula43ClasseObjetc.Atividades.Questao03;

public class Mamifero extends Animal {

    private String alimento;

    Mamifero() {
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel"; // Foi colocado o alimento padrão no construtor
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


    @Override
    public String toString() {
        String s = super.toString(); // Chamando o método toString da classe super;
        s += "Alimento: " + alimento;
        return s;
    }

}

