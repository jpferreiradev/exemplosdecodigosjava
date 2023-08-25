package OORevisao.Aula55EnumeradoresMetodosValueEValueOFF;

import OORevisao.Aula54EnumeradoresClasseConstrutorMetodos.DiaSemana;

public class TestaEnu {
    public static void main(String[] args){
// Classe criada, exemplo de como interar, mostrar todos os enumeradores na tela;

        // Array dias;
        DiaSemana[] dias = DiaSemana.values(); // O método values obtem todos os valores de um determinado enumerador;


        for(int i = 0; i < dias.length; i++){ // Exemplo for normal;
            System.out.println(dias[i]);
        }
        System.out.println("-----------------");

        for( DiaSemana dia : DiaSemana.values()){ // Exemplo for melhorado;
            System.out.println(dia);
        }



    }
}


