package OORevisao.aula36.RelacionamentoEntreClasses.Exercicios.atividade1;

public class Contato {

    private String nome;
    private String telefone;
    private String email;

    Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    Contato(){

    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String obterInfo(){
        return "Nome = " + this.nome + ";" +
                "Telefone:" + this.telefone + ";" +
                "Email:" + this.email;
    }

}


    // Parecido com metodo toString
    /*
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }



 */