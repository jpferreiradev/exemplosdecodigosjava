package OORevisao.aula35.Recursividade.ApostilaQuestoes;

public class Questao01 {

    public static int primeiraSoma(int numero){

        if( numero < -0){
            return 1;
        }

        return numero + primeiraSoma(numero - 1);

    }
}
