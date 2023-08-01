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

    @Override
    public String toString() {
        String s = "ContaEspecial";
            s += "Limite" + limite;
            s += "; " + super.toString();
            s += "]";
        return s;
    }

    public boolean sacar(double valor){

        double saldoComLimite = this.getSaldo() + this.limite;
        if((saldoComLimite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }



}
