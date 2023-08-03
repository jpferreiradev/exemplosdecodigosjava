package OORevisao.Aula45InterfacesHerancaCastingInstanceOf;

import java.io.ObjectStreamException;

public class TesteDois {
    public static void main(String[] args) {

        Object obj1 = obterString(); // Class Objet superClass do Java
        String s1 = (String) obj1; // A classe String é uma subclasse do Object // Aqui foi feito o DOWNCast

        Object obj2 = "Minha String "; // Só essa linha aqui já mostra um UPcast; // Referenciando uma String diretamente;
        String s2 = (String) obj2;

        Object obj3 = new Object(); // Aqui não está fazendo referencia a nenhuma String
        //String s3 = (String) obj3;

        Object obj4 = obterInteiro();
        String s4 = (String) obj4;
    }

    public static String obterString(){
        return "minha String";
    }
    public static int obterInteiro(){
        return 1;
    }
}
