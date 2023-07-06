package OORevisao.aula34MetodosEstaticos.Atividades.questao01Resolvida;

public class Contador {

    static int cont;

    public Contador(){
        cont++;
    }

    public static void incrementar(){
        cont++;
    }
    public static void zerar(){
        cont = 0;
    }
    public static int obterValor(){
        return cont;
    }


}
