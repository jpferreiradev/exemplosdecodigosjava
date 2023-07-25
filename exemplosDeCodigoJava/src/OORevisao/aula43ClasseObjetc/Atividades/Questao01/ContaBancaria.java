package OORevisao.aula43ClasseObjetc.Atividades.Questao01;

public class ContaBancaria {

        private String nomeCliente;
        private int numeroConta;
        private double saldo;

        ContaBancaria(){

        }
        ContaBancaria(String nomeCliente, int numeroConta,double saldo){
            this.nomeCliente = nomeCliente;
            this.numeroConta = numeroConta;
            this.saldo = saldo;

        }

        public String getNomeCliente(){
            return this.nomeCliente;
        }
        public void setNomeCliente(String nomeCliente){
            this.nomeCliente = nomeCliente;
        }
        public int getNumeroConta(){
            return this.numeroConta;
        }
        public void setNumeroConta(int numeroConta){
            this.numeroConta = numeroConta;
        }
        public double getSaldo(){
            return this.saldo;
        }
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

        
}
