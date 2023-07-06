package todasAtividadesDaCarreira;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questaoTreze {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##");


        System.out.println("Digite a sua altura: ");
        double minhaAltura = scan.nextDouble();
        System.out.println("Digite o seu sexo entre M para Masculino ou F para feminino : ");
        String meuSexo = scan.next();
        System.out.println("Sua altura é " + minhaAltura + "cm e o seu tipo sexo é " + meuSexo);


        double conversaoPesoIdealMascu = (72.7 * minhaAltura ) - 58;
        double conversaoPesoIdealFemi = (62.1 * minhaAltura) - 44.7;

        if(meuSexo.equals("M") || meuSexo.equals("m")){
            System.out.println("Seu peso é " + df.format(conversaoPesoIdealMascu) + "kg M");
        }
        if(meuSexo.equals("F") || meuSexo.equals("f")) {
            System.out.println("Seu peso é " + df.format(conversaoPesoIdealFemi) + "kg F");
        }

        System.out.println("Digite o seu peso:" );

        double pesoIdeal = scan.nextDouble();

        if(pesoIdeal < 18.5){
            System.out.println("Você está abaixo do peso");
        } else if(pesoIdeal >= 18.5 && pesoIdeal <= 24.9){
            System.out.println("Você está no seu peso ideal");
        } else if(pesoIdeal > 25 && pesoIdeal > 29.9){
            System.out.println("Você está com sobrepeso");
        }
    }
}

//  double conversaoPesoIdealMascu = (72.7 * minhaAltura ) - 58;
//double conversaoPesoIdealFemi = (62.1 * minhaAltura ) - 44.7;

//;char c = sc.next().charAt(0);
//System.out.println(meuSexo);
//char meuSexo = scan.next().charAt(0);