import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

        reader.close();
    }
}
