
import java.util.Scanner;

public class Main_39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " numbers is: " + sum);

    }
}

