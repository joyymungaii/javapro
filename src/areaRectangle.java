import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();

        System.out.println("Enter the width of the rectangle");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is " + area);

        sc.close();
    }
    public static double area(double length, double width) {
        return length * width;
    }


}
