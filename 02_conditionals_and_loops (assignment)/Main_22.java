
import java.util.Scanner;

public class Main_22 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = in.nextInt();

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product *digit;
            n = n / 10;
        }
        System.out.println("SUM : " + sum);
        System.out.println("PRODUCT : " + product);

        int result = product - sum;
        System.out.println("RESULT : " + result);
    }
}
