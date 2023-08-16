package OORevisao.Aula50ExceptionStacktraceEThrows;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args){
        // Exemplo de leitura de caracteres

        System.out.println("Entre com um número decimal: ");
        try {
            double numero = lerNumero();
            System.out.println("Você digitou: " + numero);
        } catch (Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace(); // Usamos aqui para nivel de log!
            //e.getMessage();
        }

    }

    public static double lerNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();
        return numero;
    }
}
