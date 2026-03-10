
import java.util.Scanner;

public class Main_24 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.print("Enter numbers : ");

        n = in.nextInt();

        while (n != 0) {
             n = in.nextInt();
            sum = sum + n;
        }
        System.out.println("SUM : " + sum);
    }
}
