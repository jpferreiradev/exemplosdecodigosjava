package OORevisao.aula43ClasseObjetc.Atividades.Questao02;

public class PessoaFisica extends Contribuinte {


    private String cpf;

    PessoaFisica() {

    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {

        double renda = this.getRendaBruta();

        if (renda <= 1.400) {
            return 0;
        } else if (renda > 1.400 && renda <= 2.100) {
            return (renda * 0.1) - 100;
        } else if (renda > 2.100 && renda <= 2.800) {
            return (renda * 0.15) - 270;
        } else if (renda > 2.800 && renda <= 3.600) {
            return (renda * 0.25) - 500;
        }
        // renda maior que 3.600
        return (renda * 0.3) - 700;
    }

    @Override
    public String toString() {
        String s = "Pessoa Fisica: ";
        s += super.toString();
        s += " CPF: " + cpf + "\n";
        s += " Imposto a ser pago:" + calcularImposto() + "\n";
        s += "-------";
        //s += "]";
        return s;

    }
}
