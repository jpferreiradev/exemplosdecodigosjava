package aula21ForEach;

public class ForEachRevisao {
    public static void main(String[] args) {


        int [] notas = new int[10];

        /*
        for(int i = 0; i < notas.length;i++){
            System.out.println("Posição: " + i );
        }
        */
        // For Each

        for(int nota : notas){
            System.out.println(nota);
        }

    }
}
