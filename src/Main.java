//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


    public class Main {
        public static void main(String[] args)
        {
            Scanner read = new Scanner(System.in);
            System.out.println("Enter Age");

            int age = read.nextInt();

            if (age > 18){
                System.out.println("Adult");
            }
            else{
                System.out.println("Child");
            }

        }

    }
