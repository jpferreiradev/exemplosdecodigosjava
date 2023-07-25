package OORevisao.aula43ClasseObjetc;

public class ClasseTeste {
    public static void main(String[] args) {

            Aluno aluno = new Aluno();
            aluno.setCurso("Sistemas de informação");
            double[] notas = {10,9,8,7}; // Uma array no java;
            aluno.setNotas(notas);

        //System.out.println(aluno.getCurso());
        System.out.println(aluno);

        String s1 = "abcd";
        String s2 = "abcD";

        //System.out.println(s1 == s2);
        //System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Ciencias da computação");
        double[] notas2 = {10,9,8,7};
        aluno2.setNotas(notas2);

        System.out.println(aluno == aluno2); // Nesse caso aqui, ele compara a referencia dos objetos

        System.out.println(aluno.equals(aluno2));




    }
}


/*
   Aluno aluno = new Aluno();

        aluno.setCurso("Sistemas de informação");
        double[] notas = {10,9,8,7}; // Exemplo de Array
        aluno.setNotas(notas);

        System.out.println(aluno.getCurso());
        System.out.println(aluno);
        //System.out.println(aluno.getNotas());
        //System.out.println(aluno.getNotas().length);
        //System.out.println(aluno.getNotas().toString());
 */