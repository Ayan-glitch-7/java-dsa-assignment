
import java.util.Scanner;

public class Main_09 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter starting number : ");
        int start = in.nextInt();

        System.out.print("Enter ending number : ");
        int end = in.nextInt();

        System.out.println("Armstrong numbers beween " + start + " and " + end + " : ");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + digit * digit * digit;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + "  ");
            }                         
        }
    }
}
