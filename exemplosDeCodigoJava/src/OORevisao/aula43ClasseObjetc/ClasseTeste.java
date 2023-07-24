package OORevisao.aula43ClasseObjetc;

public class ClasseTeste {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("Sistemas de informação");
        double[] notas = {10,9,8,7}; // Exemplo de Array
        aluno.setNotas(notas);

        System.out.println(aluno.getCurso());
        System.out.println(aluno);
        //System.out.println(aluno.getNotas());
        //System.out.println(aluno.getNotas().length);
        //System.out.println(aluno.getNotas().toString());
    }
}
