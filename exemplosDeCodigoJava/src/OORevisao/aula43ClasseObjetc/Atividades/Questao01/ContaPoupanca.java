package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

import java.text.DecimalFormat;

public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento;

    DecimalFormat df = new DecimalFormat();


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

    public double calcularNovoSaldo() {

        df.applyPattern("#,##0.00");
        double conversaoRendimento = 0.5 / 100;
        double conversaoRedimentoPoupanca = getSaldo() * conversaoRendimento;
        double novoSaldo = conversaoRedimentoPoupanca;
        System.out.println("Seu novo saldo é:" + novoSaldo);


        return 0;
    }
}
