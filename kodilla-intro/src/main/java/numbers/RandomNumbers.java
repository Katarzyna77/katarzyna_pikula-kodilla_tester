package numbers;


import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;

        ArrayList<Integer> drawnNumbers = new ArrayList<>();

        for (int i = 0; i <= 30; i++) {
            int drawn = random.nextInt(30);
            drawnNumbers.add(drawn);
            sum += drawn;
            if (sum > 5000) {
                break;
            }

            System.out.println(drawnNumbers);
            System.out.println("Max = " + findMax(drawnNumbers));
            System.out.println("Min = " + findMin(drawnNumbers));
            System.out.println(drawn + "," + sum);

        }

    }

    private static int findMax(ArrayList<Integer> drawnNumbers) {
        int max = -2000000000;

        drawnNumbers.stream().max(Integer::compareTo);

        for (Integer drawnNumber : drawnNumbers) {
            if (drawnNumber > max) {
                max = drawnNumber;
            }

        }
        return max;
    }

    private static int findMin(ArrayList<Integer> drawnNumbers) {
        int min = 2000000000;

        drawnNumbers.stream().min(Integer::compareTo);

        for (Integer drawnNumber : drawnNumbers) {
            if (drawnNumber < min) {
                min = drawnNumber;
            }

        }
        return min;
    }


}
