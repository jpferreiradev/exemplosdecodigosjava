package OORevisao.Aula52ExceptionCriandoSuaPropriaException.Atividade;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        // Aqui foi feita a opção do menu, pesquisar como criar esse menu dentro de uma classe;

        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan); // entrada do menu
            if (opcao == 1) { // consultar contato
                consultaContato(scan, agenda);
            } else if (opcao == 2) { // Adicionar contato
                adicionarContato(scan, agenda);
            } else if (opcao == 3) { // Sair
                System.exit(0); // Aprenda sobre o System.exit [ Aqui termina o programa]
            }
        }

    }


    public static void adicionarContato(Scanner scan, Agenda agenda) {

        try {
            System.out.println("Criando um contato, entre com as informações:");
            String nome = leInformacao(scan, "Entre com o nome do contato: ");
            String telefone = leInformacao(scan, "Entre com o telefone do contato");
            String email = leInformacao(scan, "Entre com o email do contato ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado:");
            System.out.println(contato);


            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }


    public static void consultaContato(Scanner scan, Agenda agenda) { // Metodo consultada contato
        String nomeContato = leInformacao(scan, "Entre com o nome do contato a ser pesquisado...");
        try {
            if (agenda.consultaContadoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacao(Scanner scan, String mensagem) {
        System.out.println(mensagem);
        String entrada = scan.nextLine();
        return entrada;
    }


    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada); //Transformando uma String em um inteiro usando o parseInt;

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;

                } else {
                    throw new Exception("Entrada inválida..."); //Tratando a exceção
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n");
            }


        }
        return opcao;
    }

}




/*
Contato c1 = new Contato();
        System.out.println(c1);

        Contato c2 = new Contato();
        System.out.println(c2);

        Contato c3 = new Contato();
        System.out.println(c3);
 */