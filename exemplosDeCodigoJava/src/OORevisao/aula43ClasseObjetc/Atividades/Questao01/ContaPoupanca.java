package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

//import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento;

    ContaPoupanca() {

    }

    ContaPoupanca(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double getDiaRendimento() {
        return this.diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupança:";
        s += "Dia do rendimento:" + diaRendimento;
        s += "; " + super.toString();
        s += "]";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance(); // Esse método getInstance vai pegar a data de hoje no Java

        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){ // Dia de hoje
            // saldo += saldo * taxaRendimento;
            this.setSaldo( this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
    return false;
    }

}


/*
O que foi usado antes da correção do exercicios

 DecimalFormat df = new DecimalFormat();

     public double calcularNovoSaldo() {

        df.applyPattern("#,##0.00");
        double conversaoRendimento = 0.5 / 100;
        double conversaoRedimentoPoupanca = getSaldo() * conversaoRendimento;
        double novoSaldo = conversaoRedimentoPoupanca;
        System.out.println("Seu novo saldo é:" + novoSaldo);


        return 0;
    }


 */