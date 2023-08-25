package OORevisao.Aula56EnumeradoresMetodosAbstratos;

public class TesteDocumento {
    public static void main(String[]args){


        Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class,"CNPJ"));
        pj.setNumeroDocumento(pj.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pj);

    }
}

/*
        for(TipoDocumento doc : TipoDocumento.values() ){
            System.out.println(doc + " - " + doc.gerarNumeroTeste());
        }
 */