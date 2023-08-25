package OORevisao.Aula56EnumeradoresMetodosAbstratos.Atividade;

public class ClasseTeste {

    public static void main(String[]args){

        Operacoes operacaoSomar = Operacoes.SOMAR;
        Operacoes operacaoSubtair = Operacoes.SUBTRAIR;
        Operacoes operacaoDividir = Operacoes.DIVIDIR;
        Operacoes operacaoMultiplicar = Operacoes.MULTIPLICAR;

        System.out.println(Operacoes.SOMAR.toString());
        System.out.println(Operacoes.SUBTRAIR.toString());
        System.out.println(Operacoes.DIVIDIR.toString());
        System.out.println(Operacoes.MULTIPLICAR.toString());
    }
}
