import java.util.Scanner;

public class Main_05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = in.nextInt();

        System.out.print("Enter 2st number : ");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is largest");
        }
        else if (num1 < num2) {
            System.out.println(num2 + " is largest");
        }
        else {
            System.out.println("Both numbers are equal");
        }
    }
}
