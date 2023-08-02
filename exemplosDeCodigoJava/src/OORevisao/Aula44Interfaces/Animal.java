package OORevisao.Aula44Interfaces;

public abstract class Animal {

    private String nome;

    Animal(){

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public abstract String emitirSom();
}
