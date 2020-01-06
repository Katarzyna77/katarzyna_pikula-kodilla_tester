package user;

public class Users {
    public static void main(String[] args) {

        User user1 = new User("Adam", 30);
        User user2 = new User("Monica", 28);
        User user3 = new User("Victor", 40);
        User user4 = new User("Tom", 26);
        User user5 = new User("Anna", 22);
        //TODO: Review: kdrzazga Users should be created in an array, not as single instances (utwórz tablicę obiektów typu User i wypełnij ją dowolnymi obiektami)

        int sum = user1.getAge() + user2.getAge() + user3.getAge() + user4.getAge() + user5.getAge();

        System.out.println("The sum of users' age is " + sum);

        int drawn = sum / 5;
        System.out.println("The drawn of users' age is " + drawn);

        //TODO: Review: kdrzazga No for loop (W pętli for wyświetl imiona użytkowników, których wiek jest poniżej średniej wieku.)
        if (user1.getAge() < drawn) {
            System.out.println("This user's age is smaller than the drawn of users' age: " + user1.getName());
        } else {
            System.out.println();
        }

        if (user2.getAge() < drawn) {
            System.out.println("This user's age is smaller than the drawn of users' age: " + user2.getName());
        } else {
            System.out.println();
        }

        if (user3.getAge() < drawn) {
            System.out.println("This user's age is smaller than the drawn of users' age: " + user3.getName());
        } else {
            System.out.println();
        }

        if (user4.getAge() < drawn) {
            System.out.println("This user's age is smaller than the drawn of users' age: " + user4.getName());
        } else {
            System.out.println();
        }

        if (user5.getAge() < drawn) {
            System.out.println("This user's age is smaller than the drawn of users' age: " + user5.getName());
        } else {
            System.out.println();
        }

    }
}
