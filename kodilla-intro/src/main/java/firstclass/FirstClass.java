package firstclass;

public class FirstClass {

    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2016);
        System.out.println(notebook.getWeight() + " " + notebook.getPrice() + " " + notebook.getYear());
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println(heavyNotebook.getWeight() + " " + heavyNotebook.getPrice() + " " + heavyNotebook.getYear());
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2013);
        System.out.println(oldNotebook.getWeight() + " " + oldNotebook.getPrice() + " " + oldNotebook.getYear());
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
    }
}
