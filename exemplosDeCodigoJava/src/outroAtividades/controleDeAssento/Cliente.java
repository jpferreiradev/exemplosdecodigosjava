package outroAtividades.controleDeAssento;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private long cpf;

    Scanner scan = new Scanner(System.in);
    DecimalFormat dc = new DecimalFormat("###########00000000000");

    //Cliente(String nome, int cpf) {
    //    this.nome = nome;
    //    this.cpf = cpf;
    //}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    public void consultaCliente() {
        System.out.println("-------------");
        //System.out.println("Nome do cliente:" + this.getNome());
        System.out.println("CPF do cliente: " + dc.format(this.getCpf()));

    }


    public void cadastroClinete() {
        System.out.println("Digite o seu nome e o seu CPF:");
        this.nome = scan.nextLine();
        System.out.println("Agora digite o seu CPF:");
        this.cpf = scan.nextLong();

        System.out.println("Seu nome é: " + nome + " e o seu CPF é: " + dc.format(this.getCpf()));;

    }


}
