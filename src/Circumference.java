import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What's the radius? ");
        double radius = Double.parseDouble(reader.nextLine());

        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);

        reader.close();
    }
}

