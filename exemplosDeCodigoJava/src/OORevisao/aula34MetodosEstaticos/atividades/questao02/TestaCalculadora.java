package OORevisao.aula34MetodosEstaticos.atividades.questao02;

public class TestaCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(1, 2));
        System.out.println(calculadora.subtrair(5, 2));
        System.out.println(calculadora.dividir(4, 2));
        System.out.println(calculadora.elevarPotencia(2, 4));
        System.out.println(calculadora.fatorialNumero());


    }
}
