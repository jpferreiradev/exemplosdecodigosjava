package OORevisao.aula33.SobrecargaMetodosConstrutores.atividades.questao01;

public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int gararantiaMeses;
    private boolean estadoLampada;
    private boolean ligada;

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int gararantiaMeses, boolean estadoLampada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.gararantiaMeses = gararantiaMeses;
        this.estadoLampada = estadoLampada;
    }
    public Lampada() {

    }


    public String getModelo() {
        return this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGararantiaMeses() {
        return gararantiaMeses;
    }

    public void setGararantiaMeses(int gararantiaMeses) {
        this.gararantiaMeses = gararantiaMeses;
    }


    public boolean isEstadoLampada() {
        return estadoLampada;
    }

    public void setEstadoLampada(boolean estadoLampada) {
        this.estadoLampada = estadoLampada;
    }

    public boolean isLigada() {
        return this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        //ligada = (true);
        setLigada(true);
    }

    public void desligar() {
        //ligada = (false);
        setLigada(false);
    }

    public void estadoLampada() {
        if(ligada){
            System.out.println("Lampada ligada");
        } else {
            System.out.println("Lamapda desligada");
        }

    }

    public void mudarEstado(){
        if(isLigada()){
            desligar();
        } else {
            ligar();
        }
    }
}


