package OORevisao.aula27.atividades.tres;

import java.util.Scanner;

public class Aluno {

    Scanner scan = new Scanner(System.in);

    String []nomes;
    int []matriculas;
    String []cursos;
    String []disciplinas;
    double[]notas;

    void cadastrarAluno(){

        System.out.println("Digite o seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite o seu curso:");
        String curso = scan.nextLine();
        System.out.println("Digite a sua matricula:");
        int matricula = scan.nextInt();


    }


    double validarNota(){
       if(notas.length >= 7){
           System.out.println("Aluno aprovado!");
       } else{
           System.out.println("Aluno reprovado");
       }
    return notas[2];
    }



}
