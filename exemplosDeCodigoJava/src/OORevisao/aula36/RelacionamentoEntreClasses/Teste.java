package OORevisao.aula36.RelacionamentoEntreClasses;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("JP");
        //contato.setEndereco("Rua Erico Alves");
        //contato.setTelefone("79991236617");

        // relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Erico Alves");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Aracaju");
        end.setEstado("Sergipe");
        end.setCep("99999-9999");

        contato.setEndereco(end);

        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setNumero("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("88888-8888");

        // Arrays de telefones
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;


        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);


        // Teste saida no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        //System.out.println(contato.getEndereco().getCidade()); // Aqui vai dar um NullPointExcepiton
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getTelefones() != null ){
            for( Telefone t : contato.getTelefones()){ // aqui poderia ter utilizado um while ou for normal
                System.out.println(t.getDdd() + " " + t.getNumero());
        }

    }


}

 /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + contato.getTelefone().getNumero());
*/}