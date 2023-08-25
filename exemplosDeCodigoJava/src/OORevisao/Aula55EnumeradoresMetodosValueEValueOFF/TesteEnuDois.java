package OORevisao.Aula55EnumeradoresMetodosValueEValueOFF;

import OORevisao.Aula53Enumeradores.DiaSemana;

public class TesteEnuDois {
    public static void main(String[] args) {

        //DiaSemana dia;

        System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class,"DOMINGO");

        System.out.println(dia);

    }
}

/*
 System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));


        //DiaSemana dia = Enum.valueOf(DiaSemana.class,"Domingo");
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);
 */