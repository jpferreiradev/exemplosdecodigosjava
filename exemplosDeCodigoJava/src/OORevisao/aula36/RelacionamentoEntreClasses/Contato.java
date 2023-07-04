package OORevisao.aula36.RelacionamentoEntreClasses;

import com.sun.source.doctree.EndElementTree;

public class Contato {


    private String nome;
    private Endereco endereco;
    private String telefone;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
