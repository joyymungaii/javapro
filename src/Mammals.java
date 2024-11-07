public class Mammals {

    class Animals {
    public void sound(){
        System.out.println("Mammals makes sounds");
    }
}

class Dog extends Animals{
    public void sound(){;
        super.sound();
        System.out.println("Dog Barks");
    }
}

class Duck extends Animals{
        public void sound(){
            super.sound();
            System.out.println("Duck Quacks");
        }
}

    public static void main(String[] args) {
        Mammals Mammals = new Mammals();

        Animals a = Mammals.new Dog();
        a.sound();

        Animals d = Mammals.new Dog();
        d.sound();


    }
}