package OORevisao.aula35.Recursividade.OutrosExemplosDois;


// Exemplo feito em Kotlin
/*
public class Questao01 {
}
n-ÉSIMO TERMO DA SEQUÊNCIA DE FIBONACCI:
índice do termo: 0, 1, 2, 3, 4, 5, 6, 7,  8...
valor do termo : 0, 1, 1, 2, 3, 5, 8, 13, 21...


f(n): n = 0 -> 0
      n = 1 -> 1
      n > 1 -> f(n-1) + f(n-2)

// implementação mais didática em Kotlin:
fun fibonacci(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1
        return fibonacci(n - 1) + fibonacci(n - 2)
        }
// implementação mais dialética em Kotlin:
        fun fibonacciK(n: Int): Int = if (n <= 1) n else fibonacciK(n - 1) + fibonacciK(n - 2)

*/