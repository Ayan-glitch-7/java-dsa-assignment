
import java.util.Scanner;

public class Main_29 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers : ");
        int n = in.nextInt();

        int sum = n;
        int count = 0;

        while (n != 0) {
            n = in.nextInt();
            sum = sum + n;
            count++;
        }

        System.out.println("SUM : " + sum);

        double avg = sum / count;
        System.out.println("Average : " +avg);
    }
}
