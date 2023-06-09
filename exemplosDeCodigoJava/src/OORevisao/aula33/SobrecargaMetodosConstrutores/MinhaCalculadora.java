package OORevisao.aula33.SobrecargaMetodosConstrutores;

public class MinhaCalculadora {

    // Nessa classe não vamos declarar nenhum atributos, apenas métodos

    public int soma( int num1, int num2){
        return num1 + num2;
    }

    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double soma(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }

    public int soma( int[] vetorInteiros){
        // Variavel local;
        int total = 0;

        for( int i = 0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }

        return total;
    }

}
