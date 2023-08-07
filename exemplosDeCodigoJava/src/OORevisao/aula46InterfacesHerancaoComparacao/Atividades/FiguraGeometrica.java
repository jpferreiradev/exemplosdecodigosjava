package OORevisao.aula46InterfacesHerancaoComparacao.Atividades;

public class FiguraGeometrica {

    private String nome;
    private String cor;

    FiguraGeometrica(){

    }
    FiguraGeometrica(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }



}
