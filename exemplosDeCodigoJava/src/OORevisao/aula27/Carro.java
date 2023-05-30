package OORevisao.aula27;

public class Carro {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    //  Método simples
    void exibirAutonomia() {

        System.out.println(" A autonomia do carro é:" + capacidadeCombustivel * consumoCombustivel + " km");
    }

    // Método com returno
    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado. ");

        return capacidadeCombustivel * consumoCombustivel;
    }

    // Método com parâmetros
    double calcularCombustivel(double km) {

        double quantidadeCombustivel = km / consumoCombustivel;

        return quantidadeCombustivel;
    }

}

