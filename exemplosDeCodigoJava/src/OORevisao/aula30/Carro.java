package OORevisao.aula30;

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel, double consumoCombustivel) {
        // Com o uso do this, deixamos explicito que esse atributo é dessa classe e esse marca é o parametro;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(){}

    public Carro(String marca, String modelo) {
       this(marca ,modelo,10); // Esse exemplo não entendi direito
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo, int numeroPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        System.out.println("Chamando construtor com 3 parâmetros");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é:" + this.capacidadeCombustivel * this.consumoCombustivel);
    }

    double obterAutonomia() {
        System.out.println("Método obterAutonimia foi chamado.");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km){

        // Aqui temos exemplo de uma variavel local desse método aqui;
        double quantidadeCombustivel = km/this.consumoCombustivel;

        return quantidadeCombustivel;
    }
}
