public class SecInYear {
    public static void main(String[] args) {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int year = days * hours * minutes * seconds;
        System.out.println("There are " + year + " seconds in a year.");
    }
}
