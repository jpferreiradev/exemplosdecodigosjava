package OORevisao.aula43ClasseObjetc.Atividades.Questao03;

public class Animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    Animal() {
        this.patas = 4; // Formato para o atributo ficar padrão
    }

    Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        String s = "Animal:" + nome + "\n" +
                "Comprimento: " + comprimento + "\n" +
                "Patas: " + patas + "\n" +
                "Cor: " + cor + "\n" +
                "Ambiente: " + ambiente + "\n" +
                "Velocidade: " + velocidade + "m/s" + "\n";
        return s;
    }
}

