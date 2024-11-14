interface Adding {
    static int add(int a, int b) {
        return a + b;
    }
}

public class adds {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 11;

        int sum = Adding.add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}