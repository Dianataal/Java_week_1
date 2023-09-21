import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = Double.parseDouble(reader.nextLine());

        if (number > 0) {
            System.out.println("This number is positive.");
        } else if (number < 0) {
            System.out.println("This number is negative.");
        } else {
            System.out.println("This number is zero.");
        }

        reader.close();
    }
}
