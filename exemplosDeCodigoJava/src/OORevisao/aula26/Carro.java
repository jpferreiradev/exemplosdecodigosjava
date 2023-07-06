package OORevisao.aula26;

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


}