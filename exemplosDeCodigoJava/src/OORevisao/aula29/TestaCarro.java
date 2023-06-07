package OORevisao.aula29;

public class TestaCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        //van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.numeroPassageiros);

        // Exemplo de um construtor passando parametros
        Carro van2 = new Carro("Fiat","Ducato",10,100,0.2);
        van2.modelo = "Ducato";

        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numeroPassageiros);
        System.out.println(van2.capacidadeCombustivel);
        System.out.println(van2.consumoCombustivel);



    }

}
