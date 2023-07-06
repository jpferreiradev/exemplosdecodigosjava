package OORevisao.aula29;

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeCombustivel;
    double consumoCombustivel;

    // Construtor simples
    Carro(){
        System.out.println("Classe carro foi instanciada");
        numeroPassageiros = 4;
    }
    // Construtor passando parametros;
    Carro(String marca_,String modelo_,int numeroPassageiros_, double capacidadeCombustivel_, double consumoCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numeroPassageiros = numeroPassageiros_;
        capacidadeCombustivel = capacidadeCombustivel_;
        consumoCombustivel = consumoCombustivel_;


    }


    void exibirAutonomia(){
        System.out.println("A autonomia do carro é:" + capacidadeCombustivel * consumoCombustivel);
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado");

        return capacidadeCombustivel * consumoCombustivel;
    }

    double calculaCombustivel(double km){
        double quantidadeCombustivel = km/consumoCombustivel;

        return quantidadeCombustivel;
    }

}
