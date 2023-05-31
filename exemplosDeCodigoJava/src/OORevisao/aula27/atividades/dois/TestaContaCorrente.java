package OORevisao.aula27.atividades.dois;

public class TestaContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.numeroConta = 1234;
        conta.saldoConta = -200;
        conta.limiteConta = 500;
        conta.contaEspecial = false;

        conta.validaConta();



    }
}
