import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(reader.nextLine());

        if (age > 1 && age < 120) {
            System.out.println("You're ok!");
        } else if (age < 1 || age > 121) {
            System.out.println("You aren't human.");
        }

        reader.close();
    }
}
