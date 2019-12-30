package array;

public class SimpleArray {
    public static void main(String[] args) {
        String[] pets = new String[]{"hamsters", "goldfish", "mice", "guinea pigs", "parrots"
        };
        String pet = pets[2];
        System.out.println(pet);

        System.out.println(pets.length);

        int numberOfPets = pets.length;
        System.out.println(numberOfPets);
        System.out.println("Moja tablica zawiera 5 elementow");

        int i;

        for (i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }

        System.out.println();

        for (i = pets.length - 1; i >= 0; i--) {
            System.out.println(pets[i]);
        }
    }
}
