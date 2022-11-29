package com.loaine.cursojava.aula10;

public class Variaveis {
    public static void main(String[] args) {

        // Declaração de variaveis no Java

        // Convenção Java
        int idade = 30;
        String nome = "João Paulo";
        String nomeDoMeuCachorro = "Pulga";
        String ano2014 = "2014";

        // Aceito, mas não utilizado
        int _idade;
        int $idade;


       // Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;


        idade = 31;

        System.out.println("Minha idade é " + idade + " meu nome é " + nome + " e o nome do meu cachorro é " + nomeDoMeuCachorro);

        // má prática
        int a = 10;
        String b = "JP";
    }
}
