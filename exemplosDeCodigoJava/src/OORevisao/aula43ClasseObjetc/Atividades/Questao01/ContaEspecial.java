package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    ContaEspecial(){

    }
    ContaEspecial(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
}
