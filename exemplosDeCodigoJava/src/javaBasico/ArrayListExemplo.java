package javaBasico;

import java.util.ArrayList;

public class ArrayListExemplo {
    public static void main(String[] args) {

        // Criação de um ArrayList

        //Classe<tipo> nome do Array = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>(100);
                                                    // Aqui você coloca o tamanho do array;
        // Inserindo dados
        carros.add("Nissan");
        carros.add("Ferrari");
        carros.add("Toyota");
        carros.add("Pejout");
        carros.add("Fusion");



        // eliminar posições que não estão sendo usadas para liberar memoria; Ele só vai mudar internamente, não vai imprimir;
        carros.trimToSize();

        //System.out.println(carros.indexOf("Ferrari"));
        //System.out.println(carros.remove("Fusion"));


        // Você pode usar sem precisar imprimir;
        System.out.println(carros.remove(2)); // Ele retorna o elemento que foi removiado, informando qual
        carros.remove(2);
        //Limpar o nosos ArrayList
        //carros.clear();


        // Pecorrer o array - Usando forEach( "novo" for)
        //for (String a : carros) {
        //    System.out.println(a);
        //}
        // Escolhendo a posição que você quer
        //System.out.println(carros.get(0));

        for(int i =0;i < carros.size();i++){
            System.out.println(carros.get(i));
        }

    }


}

/*


  ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(11);
       numeros.add(22);
       numeros.add(33);

         for(int e:numeros){
            System.out.println(e);
        }


 */