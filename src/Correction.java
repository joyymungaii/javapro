//The code given below shows a compile-time error. Can you suggest the appropriate corrections?


//seccond one
class X {
    public X(int i) {
        System.out.println("Parent Class.");
    }
}

class Y extends X {
    public Y() {
        super(10); // Calling the parent class constructor with an int argument
        System.out.println("Child Class.");
    }
}

public class Correction {
    public static void main(String[] args) {
        Y y = new Y(); // Create an object of class Y
    }
}
