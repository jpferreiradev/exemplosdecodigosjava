package OORevisao.aula33.SobrecargaMetodosConstrutores.questao02;

public class TestaContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(304, 50.0, true);

        //conta.depositar();
        //conta.sacar();
        conta.consultaSaldo();

    }
}
