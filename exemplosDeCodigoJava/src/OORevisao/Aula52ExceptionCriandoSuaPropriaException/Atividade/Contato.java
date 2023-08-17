package OORevisao.Aula52ExceptionCriandoSuaPropriaException.Atividade;

public class Contato {

    private static int contador = 0;
    private String nome;
    private String telefone;
    private String email;
    private int identificador;

    public Contato() {
        contador++;
        identificador = contador;
        // Toda vez que for instanciada essa classe, irá ter um contador que vai ter 1,2,3
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdentificador() {
        return this.identificador;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "ID:" + identificador;
        s += ",Nome" + nome;
        s += ",Telefone: " + telefone;
        s += ",Email: " + email;
        s += "]";
        return s;

    }
}
