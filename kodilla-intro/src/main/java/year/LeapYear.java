package year;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        if (leapYear.checkYear(2019))
            System.out.println("This is leap year.");
    }

    public boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0);
    }
}
