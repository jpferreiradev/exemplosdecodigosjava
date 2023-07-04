package OORevisao.aula35.Recursividade.DiscordExemplo;

public class PrimeiraQuestao {

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } if(n == 1){
            return 1;
        }
            return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
