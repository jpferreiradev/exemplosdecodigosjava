package OORevisao.aula33.SobrecargaMetodosConstrutores.questao02;

public class TestaContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(304, 50.0, true);
        ContaCorrente contaDois = new ContaCorrente(303,40.0,false);

        //conta.depositar();
        //conta.consultaSaldo();
        conta.validaConta();
        contaDois.validaConta();
        conta.tipoConta();
        contaDois.tipoConta();
        //conta.sacar();


    }
}
