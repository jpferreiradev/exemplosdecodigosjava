package OORevisao.aula24.atividades.questao03;

public class TestaConta {
    public static void main(String []args){


        ContaCorrente conta = new ContaCorrente();

        conta.numero = "12345";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteConta = 500;
        conta.saldoConta = 10;
    }
}
