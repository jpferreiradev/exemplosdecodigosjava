package OORevisao.aula46InterfacesHerancaoComparacao;

public interface BancoDados extends SqlDCL,SqlDML,SqlDDL {

    void abrirConexao();

    void fecharConexao();


}
