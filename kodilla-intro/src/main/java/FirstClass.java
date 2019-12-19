public class FirstClass {//review TODO: pls use formatting Ctrl+Alt+L in IntelliJ
    public static void main (String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2016);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2013);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price+ " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
    }
}
