public class Aluche {
}

//What will be the output of the program given below?

class Base

{

    public void Print()

    {

        System.out.println("Welcome to Base class");

    }

}



class Derived extends Base {

    public void Print() {

        System.out.println("Now, it is Derived class");

    }

}

class Dudu

{

    public static void DoPrint( Base o ) {

        o.Print();

    }

    public static void main(String[] args) {

        Base x = new Base();

        Base y = new Derived();

        Derived z = new Derived();

        DoPrint(x);

        DoPrint(y);

        DoPrint(z);

    }

}
