
import java.util.Scanner;

public class Main_21 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of terms : ");
        int n = in.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("FIBONACCI SERIES : ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + "  ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}