package OORevisao.aula24.atividades.questao02;

import java.util.Date;

public class TestaLivroBiblioteca {
    public static void main(String[] args) {


       LivroBiblioteca book = new LivroBiblioteca();

       book.nomelivro = "Mastering ExtJs";
       book.nomeautor = "Loiane Groner";
       book.anoLancamento = 2015;

       book.emprestado = true;
       book.dataEntrega = new Date();
       book.emprestadoA = "JP";

        System.out.println("Nome do livro:" + book.nomelivro);
        System.out.println("Data" + book.dataEntrega);






    }

}
