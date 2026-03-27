
import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = in.nextInt();

        age_test(age);
    }

    static int age_test(int age) {
        if (age >= 18) {
            System.out.println("allowed to vote");
        }
        else{
            System.out.println("not allowed to vote");
        }
        return age;
    }
}
