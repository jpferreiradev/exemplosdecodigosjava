package OORevisao.aula34MetodosEstaticos.DevSuperior;

public class Funcionario {

    String nome;
    double valorPorHora;
    double horasTrabalhadas;


    public Funcionario(String nome,double valorPorHora,double horasTrabalhadas){
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double valorPago(){
        return valorPorHora * horasTrabalhadas;
    }

    public double diminuir(){
        return valorPorHora - horasTrabalhadas;
    }

}
