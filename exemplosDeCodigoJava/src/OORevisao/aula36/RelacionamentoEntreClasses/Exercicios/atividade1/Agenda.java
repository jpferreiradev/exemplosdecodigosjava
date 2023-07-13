package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1;

import java.util.Scanner;

public class Agenda {

    private String nomeAgenda;
    private Contato[] contatos;

    //Scanner scan = new Scanner(System.in);
    Agenda(String nomeAgenda){
        this.nomeAgenda = nomeAgenda;
    }
    Agenda(String nomeAgenda, Contato[] contatos){
        this.nomeAgenda = nomeAgenda;
        this.contatos = contatos;


    }
    public String getNomeAgenda(){
        return this.nomeAgenda;
    }
    public void setNome(String nomeAgenda){
        this.nomeAgenda = nomeAgenda;
    }

    public Contato[] getContatos() {
        return this.contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
            String info = "Nome :" + this.nomeAgenda + "\n";

            if(contatos != null){
                for(Contato c : contatos){
                    info += c.obterInfo() + "\n";
                }
            }

            return info;
    }


}

/* // Tentei criar um metodo que já chama
 public void imprimir(){
        System.out.println("Digite o nome da sua agenda: ");
         //= scan.nextLine();
        System.out.println("O nome da sua agenda é: " + getNomeAgenda());
    }


 */