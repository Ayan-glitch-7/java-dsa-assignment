
import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("number 1 : ");
        int num1 = in.nextInt();

        System.out.print("number 2 : ");
        int num2 = in.nextInt();

        System.out.print("number 3 : ");
        int num3 = in.nextInt();

        pythagorean(num1, num2, num3);

    }
    static void pythagorean (int num1, int num2, int num3) {
        if (num1 * num1 == num2 * num2 + num3 * num3) {
            System.out.println("numbers are pythagorean numbers");
        }
        else if (num2 * num2 == num1 * num1 + num3 * num3) {
            System.out.println("numbers are pythagorean numbers");
        }
        else if (num3 * num3 == num1 * num1 + num2 * num2) {
            System.out.println("numbers are pythagorean numbers");
        }
        else {
            System.out.println("numbers are  not pythagorean numbers");
        }
    }
}
