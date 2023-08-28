package OORevisao.Aula56EnumeradoresMetodosAbstratos.Atividade;

public class ClasseTeste {

    public static void main(String[]args){

        /*
        Operacoes operacaoSomar = Operacoes.SOMAR;
        Operacoes operacaoSubtair = Operacoes.SUBTRAIR;
        Operacoes operacaoDividir = Operacoes.DIVIDIR;
        Operacoes operacaoMultiplicar = Operacoes.MULTIPLICAR;

        double operacaoSomarDois = Operacoes.SOMAR.executarOperacao(1,2);




        //System.out.println(Operacoes.SOMAR.toString());
        //System.out.println(Operacoes.SUBTRAIR.toString());
        //;System.out.println(Operacoes.DIVIDIR.toString());
        //System.out.println(Operacoes.MULTIPLICAR.toString());

        System.out.println("A soma foi: " + operacaoSomar.executarOperacao(1,2));
        System.out.println("A subtração foi: " + operacaoSubtair.executarOperacao(9,8));
        System.out.println("A divisão foi:" + operacaoDividir.executarOperacao(4,5));
        System.out.println("A multiplicação foi:" + operacaoMultiplicar.executarOperacao(5,6));

        for(Operacoes opera : Operacoes.values()){
            System.out.println(opera);
        }
        */
    // Como a professora fez:


        double x = 2.0;
        double y = 3.0;

        for(Operacoes op : Operacoes.values()){
            System.out.print(x + " ");
            System.out.print(op.toString());
            System.out.print(y + " = ");
            System.out.println(op.executarOperacao(x,y));
        }
    }
}
