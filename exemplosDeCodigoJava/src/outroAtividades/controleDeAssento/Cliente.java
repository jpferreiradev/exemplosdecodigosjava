package outroAtividades.controleDeAssento;

import java.util.Scanner;

public class Cliente {



    private String nome;
    private int cpf;

    Cliente(String nome, int cpf){
         this.nome = nome;
         this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCpf(){
        return this.cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }


    public void consultaCliente(){
        System.out.println("-------------");
        //System.out.println("Nome do cliente:" + this.getNome());
        System.out.println("CPF do cliente: " + this.getCpf());

    }


    public void cadastroClinete(){
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o seu nome");
        int


    }


}
