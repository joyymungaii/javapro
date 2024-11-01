import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = scanner.nextDouble(); // Get the radius from user input

        double area = area(r); // Call the add method with the radius
        System.out.println("The area of the circle is: " + area);

        scanner.close(); // Close the scanner
    }

    public static double area(double r) {
        double PI = 3.14; // Pi value
        return PI * r * r; // Calculate area
    }

    public static double findarea(double l, double w) {
        return l * w;
    }
}