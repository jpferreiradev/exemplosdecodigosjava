package aula19Arrays;

public class ExemploMemoriaArray {

    public static void main(String[] args) {
        // Outra forma que é feita um Array no Java


        int nums[] = {99, -10, 1001123, 18, -978, 5623, 463, -9, 287, 49};

        int min, max;

        min = max = nums[0];

        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];

        }
        System.out.println(" Máximo e minimo: " + max + " " + min);
    }

}


/*
 int exemplo[] = new int[10];
        int min, max;

        exemplo[0] = 99;
        exemplo[1] = -10;
        exemplo[2] = 1001123;
        exemplo[3] = 17;
        exemplo[4] = -978;
        exemplo[5] = -9;
        exemplo[6] = 463;
        exemplo[7] = 283;
        exemplo[8] = 96;
        exemplo[9] = 87;


        min = max = exemplo[0];

        for(int i = 1; i < 10; i++){
            if(exemplo[i] < min) min = exemplo[i];
            if(exemplo[i] > max) max = exemplo[i];



 */



/*



      for(i = 0; i < 10;i++){
            exemplo[i] = i;
            System.out.println(exemplo[i]);

        }

 //exemplo[0] = 1;
        //exemplo[1] = 2;
        //exemplo[2] = 3;
  //System.out.println(exemplo[2]);

 */