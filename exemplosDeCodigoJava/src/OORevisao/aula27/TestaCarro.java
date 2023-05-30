package OORevisao.aula27;


public class TestaCarro {
    public static void main(String[] args) {

        // Instancia do carro
        Carro van = new Carro();

        // Atribuição de valores para os seus atributos
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println();

        // Chamando o primeiro método simples
        //van.exibirAutonomia();

        // Chamando o segundo com returno
        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é:" + autonomia);
        //System.out.println("A autonomia do carro é:" + van.obterAutonomia());

        // Chamando o terceiro método com parâmetros
        //double quantidadeCombustivel10 = van.calcularCombustivel(10);
        //double quantidadeCombustivel15 = van.calcularCombustivel(15);

        //System.out.println("quantidadeCombustivel10 = " + quantidadeCombustivel10);
        //System.out.println("quantidadeCombustivel15 = " + quantidadeCombustivel15);
    }
}
