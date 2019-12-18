public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }
    public void checkPrice() {
        if(this.price < 601){
            System.out.println("This notebook is very cheap.");
        } else if(this.price > 601 && this.price < 1201){
            System.out.println("The price is good.");
        } else{
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight(){
        if(this.weight < 601){
            System.out.println("This notebook is light.");
        }else if(this.weight >601 && this.weight <2000){
            System.out.println("This notebook isn't very heavy.");
        }else{
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear(){
        if(this.year >2018){
            System.out.println("This notebook is new.");
        }  else if(this.year <2018 && this.year>2013){
            System.out.println("This notebook isn't very old.");
        } else {
            System.out.println("This notebook is old.");
        }
    }
}

