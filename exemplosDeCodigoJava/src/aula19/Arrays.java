package aula19;

public class Arrays {
    public static void main(String[] args) {

        // Boa prática
        // Declarar o tipo do array,[]
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 33.7;
        temperaturas[2] = 34;
        temperaturas[3] = 33.1;
        temperaturas[4] = 33.5;

        System.out.println("O valor da temperatura do dia 1:" + temperaturas[0]);
        System.out.println("O valor da temperatura do dia 1:" + temperaturas[1]);
        System.out.println("O valor da temperatura do dia 1:" + temperaturas[2]);
        System.out.println("O valor da temperatura do dia 1:" + temperaturas[3]);
        System.out.println("O valor da temperatura do dia 1:" + temperaturas[4]);

        // Tamanho do array
        System.out.println("O tamanho do arryay: " + temperaturas.length);

        System.out.println("Valores do array: " + temperaturas); // Aqui vai mostrar o endereço de mémoria em que esse Array está apotando, foi reservado pelo Java;

        // Para sabermos os valores do array usando for
        // For antigo, abaixo o for melhorado
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia" + (i + 1) + " é: " + temperaturas[i]);
        }

        // Uso do for melhorado, foi introduzido no Java 5
        for(double temp : temperaturas){
            System.out.println(temp);
        }

        //Usa o forEach tipo inteiro
        for(double count : temperaturas){
            System.out.println(count);
        }
    }

}

/*
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;
 */