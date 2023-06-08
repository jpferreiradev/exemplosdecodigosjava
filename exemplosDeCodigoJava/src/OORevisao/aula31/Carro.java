package OORevisao.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    private double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é:" + this.capacidadeCombustivel * this.consumoCombustivel);
    }

    public double obterAutonomia() {
        System.out.println("Método obterAutonimia foi chamado.");

        return this.capacidadeCombustivel * this.consumoCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;
    }
    public double calcularCombustivel(double km) {

        // Aqui temos exemplo de uma variavel local desse método aqui;
        //double quantidadeCombustivel = km / this.consumoCombustivel;

        return this.divideKmPorConsumoCombustivel(km);
    }


}
