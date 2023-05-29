package OORevisao.aula24.atividades.questao04;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TestaAgenda {
    public static void main(String []args){

        //DecimalFormat dm = new DecimalFormat("#/#/#");
        //Scanner scan = new Scanner();

        AgendaCelular contatoUm = new AgendaCelular();
        AgendaCelular contadoDois = new AgendaCelular();


        contatoUm.nome = "Thay";
        contatoUm.email = "thaynararicarte@hotmail.com";
        //contatoUm.dataNasimento = 070192;
        contatoUm.numeroCelular = 99047643;
        contatoUm.numeroTelefoneFixo = 32471558;

        contadoDois.nome = "JP";
        contadoDois.email = "jotepauder01@gmail.com";
        //contadoDois.dataNasimento = 011291;
        contadoDois.numeroCelular = 991236617;
        contadoDois.numeroTelefoneFixo = 32471567;




    }
}
