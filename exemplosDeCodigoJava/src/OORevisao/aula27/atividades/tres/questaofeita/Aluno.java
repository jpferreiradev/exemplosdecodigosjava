package OORevisao.aula27.atividades.tres.questaofeita;

public class Aluno {

    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];


    // Primeiro método sem returno ou parametro
    void mostraInfo() {
        System.out.println("Nome:" + nome);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Nome do curso:" + nomeCurso);
        System.out.println();

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.println("Notas da disciplina" + nomeDisciplinas);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j]);
            }
            System.out.println();
        }
    }

    // Segundo método com retorno e parametro
    boolean verificarAprovado(int indice) {
        if (obterMedia(indice) >= 7) {
            return true;
        }
        return false;
    }

    double obterMedia(int indice){

        double soma = 0;

        for (int i=0; i<notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        return media;
    }// Terceiro método com retorno e parametro

}
