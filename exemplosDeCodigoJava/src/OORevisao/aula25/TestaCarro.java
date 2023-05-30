package OORevisao.aula25;


public class TestaCarro {
    public static void main(String[] args) {

        // Declarmos uma variavel " van" que é do tipo Carro, instanciamos esse carro
        Carro van = new Carro();

        // Setamos alguns valores para os atributos
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println();

        // Insntanciando o método
        van.exibirAutonomia();

    }
}
