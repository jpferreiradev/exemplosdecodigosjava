package OORevisao.aula35.Recursividade.DiscordExemplo;

public class Atividade {

    static int funcaoRecursiva(int n) {
        if (n > 0) {
            return n + funcaoRecursiva(n - 1);
        }
        return 0;
    }
    static double potencia(double a, double b){

        return Math.pow(a,b);

    }
}
