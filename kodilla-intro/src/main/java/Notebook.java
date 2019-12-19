class Notebook {

    private final int weight;
    private final int price;
    private final int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is light.");
        } else if (this.weight <= 1200) {
            System.out.println("This notebook isn't very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkYear() {
        if (this.year >= 2019) {
            System.out.println("This notebook is new.");
        } else if (this.year >= 2016) {
            System.out.println("This notebook isn't very old.");
        } else {
            System.out.println("This notebook is old.");
        }
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public int getYear() {
        return year;
    }
}

