package OORevisao.aula43ClasseObjetc.Atividades.Questao02;

public class PessoaJuridica extends Contribuinte{


    private String cnpj;

    PessoaJuridica(){

    }

    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
       String s = "Pessoa Juridica: ";
       s += super.toString();
       s += "CNPJ: " + cnpj + "\n";
       s += "Imposto a ser pago: " + calcularImposto() + "\n";
       s += "-------";
       //s += ":";
       return s;
    }
}

/*
 public PessoaJuridica(String nome) {
        super();
    }

    public double calculoImposto(){



        return 0;
    }


 */