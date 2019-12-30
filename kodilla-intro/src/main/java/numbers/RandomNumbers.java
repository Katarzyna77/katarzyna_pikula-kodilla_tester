package numbers;

import java.util.Random;

public class RandomNumbers {
    public static void main (String[] args){
        Random random = new Random();

        for (int i = 0; i <= 30; i++) {
            System.out.println(random.nextInt(30));
        }

    System.out.println();

    }
    public int getResult (){ //TODO REVIEW kdrzazga: method not used
        Random random = new Random();
        int max = 5000;
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;

        }
        return result;

    }






}
