package OORevisao.aula33.SobrecargaMetodosConstrutores;

public class TesteCalculadora {
    public static void main(String[] args) {

        MinhaCalculadora cal = new MinhaCalculadora();

        cal.soma(1,2);
        cal.soma(1.0,2.0,3.0);

        System.out.println(cal.soma(1,2));
        System.out.println(cal.soma(1.0,2.0,3.0));


    }

}
