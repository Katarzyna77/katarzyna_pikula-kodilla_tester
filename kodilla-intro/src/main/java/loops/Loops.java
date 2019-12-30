package loops;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int total = 0;

        for (int i = 0; i <= numbers.length; i++) {
            total += i;
        }
        System.out.println(total);

        int product = 1;
        for (int i = 1; i <= numbers.length; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
