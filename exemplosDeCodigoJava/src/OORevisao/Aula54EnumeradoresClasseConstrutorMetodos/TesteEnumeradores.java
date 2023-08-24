package OORevisao.Aula54EnumeradoresClasseConstrutorMetodos;

public class TesteEnumeradores {
    public static void main(String[] args){



        // Instanciando Enumeradores da classe DiaSemana
        DiaSemana dia = DiaSemana.DOMINGO;
        DiaSemana diaDois = DiaSemana.SEGUNDA;
        DiaSemana diatres = DiaSemana.TERÇA;

        System.out.println(dia.toString() + " - " + dia.getValor());
        System.out.println(diaDois.toString() + " - " + diaDois.getValor());
        System.out.println(diatres.toString() + " - " + diatres.getValor());

        // Instanciando a classe Data com um Enu
        Data data = new Data(24,8,2023,DiaSemana.SEXTA); // DiaSemana é um Enu
        Data dataDois = new Data(01,12,1991,DiaSemana.DOMINGO);


    }


}
