package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1;

import java.util.Scanner;

public class TestaAtividade1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda("Agenda JP");
        //Agenda agendaDois = new Agenda("Agenda Thay");

        //agenda.imprimir();
        //agendaDois.imprimir();

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entre com as informações do contato: " + (i + 1)); // O mais (i+1) é para no final obter por exemplo: Contato 1, Contato 2, Contato 3;
            Contato c = new Contato();

            System.out.println("Entre com o nome: ");
            String nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email: ");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c; // Adicionando o nosso objeto no Array;


        }
        agenda.setContatos(contatos); // Setar o setContatos nas nossa agenda

        if( agenda != null){
            System.out.println(agenda.obterInfo());
        }


    }
}

//Agenda agendaDois = new Agenda("AgendaThay","Contato");
//Contato primeiroContato = new Contato("JP","991236617","jotepauder01@gmail.com");

//System.out.println(primeiroContato.toString());