
import java.util.Scanner;

public class Main_40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int original = num;
        double sum = 0;
        int digits = 0;
 
        // Count number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + Math.pow(digit, digits);
            temp /= 10;
        }
 
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
 
    }
}

