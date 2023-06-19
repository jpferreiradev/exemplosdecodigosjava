package OORevisao.aula34MetodosEstaticos.DevSuperior;

public class TestaFunionario {
    public static void main(String[] args) {

        Funcionario x = new Funcionario("Thay",100.0,15.0);
        Funcionario y = new Funcionario("João", 80.0,10.0);


        double resultado = CalculadoraDeSalario.valorPago(100.0, 7.0);

        //double total = Funcionario.valorPago();

        System.out.println(resultado);
    }
}
