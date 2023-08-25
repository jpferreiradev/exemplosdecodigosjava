package OORevisao.aula35.Recursividade;

public class OutroExemploMetodoRecursivo {
    public static void main(String[] args) {
        // Qualquer dessas 4 linhas dará erro de stack overflow:
        // fatorialRecursivoSemCriterioDeParada(1);
        // fatorialRecursivo(Integer.MAX_VALUE); // critério de parada muito distante.
        // new ClasseADependenteDeB();
        // new ClasseComMembroDeInstanciaDoProprioTipo();
    }

    public static int fatorialRecursivoSemCriterioDeParada(int n) {
        // if (n == 0) return 1; // critério de parada removido.
        return n * fatorialRecursivoSemCriterioDeParada(n - 1);
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0) return 1;
        return n * fatorialRecursivoSemCriterioDeParada(n - 1);
    }
}

class ClasseADependenteDeB {
    ClasseBDependenteDeA membro = new ClasseBDependenteDeA();

    public ClasseADependenteDeB() {
        membro = new ClasseBDependenteDeA();
    }
}

class ClasseBDependenteDeA {
    ClasseADependenteDeB membro = new ClasseADependenteDeB();

    public ClasseBDependenteDeA() {
        membro = new ClasseADependenteDeB();
    }
}

class ClasseComMembroDeInstanciaDoProprioTipo {
    ClasseComMembroDeInstanciaDoProprioTipo membro = new ClasseComMembroDeInstanciaDoProprioTipo();
}


/*
Mas a causa mais comum desse erro costuma ser algum algoritmo recursivo sem critério de parada, ou com critério de parada tão distante que a stack da JVM não tem memória suficiente pra empilhar todas as chamadas...
Outro cenário comum (mas menos do que o anterior) é dependência cíclica na construção de objetos. Por exemplo, o construtor da classe A instancia um objeto da classe B, e o construtor da classe B instancia um objeto da classe A.

Error: java.lang.StackoverflowError Create breakpoint: null:


 */