import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String enteredPassword = scanner.nextLine();
        String correctPassword = "tomato"; // Change this to your desired password

        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Correct!");
            System.out.println("Tomato is a fruit.");
        } else {
            System.out.println("Wrong password!");
        }

        scanner.close();
    }
}
