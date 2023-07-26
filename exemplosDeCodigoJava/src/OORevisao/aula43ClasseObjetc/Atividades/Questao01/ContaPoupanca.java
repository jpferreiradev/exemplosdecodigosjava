package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

public class ContaPoupanca extends ContaBancaria{

    private double diaRendimento;

    ContaPoupanca(){

    }
    ContaPoupanca(double diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento(){
        return this.diaRendimento;
    }
    public void setDiaRendimento(double diaRendimento ){
        this.diaRendimento = diaRendimento;
    }

     public double calcularNovoSaldo(){


        return 0;
     }
}
