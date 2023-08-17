package OORevisao.Aula52ExceptionCriandoSuaPropriaException.Atividade;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos; // Arry de contatos

    public Agenda() {
        contatos = new Contato[5]; // Construtor para agenda, com 5 contatos
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException { // Modo como adicionar um contato;

        boolean cheia = true;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false; // Aqui sabemos quando a gente estiver cheia;
                break;
            }
        }
        if (cheia) {
            throw new AgendaCheiaException();
        }
    }

    public int consultaContadoPorNome(String nome) throws ContatoNaoExisteException { // Como consultar um contato por nome;

        for (int i = 0; i < contatos.length; i++) {   // For normal
            if (contatos[i] != null) { //Aqui verifica se ele tem contato;
                if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        // lançar exception contato nao existe
       throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) { // For melhorado
            if(c != null){
                s += c.toString() + "\n";
            }


        }
        return s;
    }
}


