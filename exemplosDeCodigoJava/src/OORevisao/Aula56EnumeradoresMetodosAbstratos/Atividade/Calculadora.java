package OORevisao.Aula56EnumeradoresMetodosAbstratos.Atividade;

public class Calculadora {


    enum Operacao{
        SOMAR("+") {
            @Override
            public double executarOperacao(double x,double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        },DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        },MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };


        private String simbulo;
        Operacao(String simbulo){
            this.simbulo = simbulo;
        }


        @Override
        public String toString() {
            return this.simbulo;
        }

        public abstract double executarOperacao(double x, double y);
    }


    public static void main(String[]args){
        double x = 5.0;
        double y = 7.0;

        for(Operacao op: Operacao.values()){
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " ");
            System.out.print(" -> ");
            System.out.println(op.executarOperacao(x,y));
        }
    }



}
