package OORevisao.aula36.RelacionamentoEntreClasses;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("JP");
        //contato.setEndereco("Rua Erico Alves");
        contato.setTelefone("79991236617");

        // Criar um objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Erico Alves");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Aracaju");
        end.setEstado("Sergipe");
        end.setCep("999999");

        contato.setEndereco(end);


        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        //System.out.println(contato.getEndereco().getCidade()); // Aqui vai dar um NullPointExcepiton
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
    }


}
