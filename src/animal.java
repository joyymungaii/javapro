public class animal {
    public static void main(String[] args) {
        String name = "dada";
        String gender = "male";
        int age = 1;
        String initials = name.substring(0, 1) + gender.substring(0, 1) ;
        String password = initials.toLowerCase() + age;
        System.out.println("Your Password is: " + password);
    }
}
