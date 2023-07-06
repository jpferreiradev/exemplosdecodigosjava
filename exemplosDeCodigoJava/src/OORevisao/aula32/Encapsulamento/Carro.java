package OORevisao.aula32.Encapsulamento;

public class Carro {

    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeCombustivel;
    private double consumoCombustivel;

    public String getMarca(){
        return this.marca; // Obter o valor da marca
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getNumeroPassageiros(){
        return this.numeroPassageiros;
    }
    public void setNumeroPassageiros(int numeroPassageiros){
        this.numeroPassageiros = numeroPassageiros;
    }
    public double getCapacidadeCombustivel(){
        return this.capacidadeCombustivel;
    }
    public void setCapacidadeCombustivel(double capacidadeCombustivel){
        this.capacidadeCombustivel = capacidadeCombustivel;
    }
    public double getConsumoCombustivel(){
        return consumoCombustivel;
    }
    public void setConsumoCombustivel(double consumoCombustivel){
        this.consumoCombustivel = consumoCombustivel;
    }

}
