
import java.util.Scanner;

public class Main_07 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of terms of fibonacci series : ");
        int n = in.nextInt();

        System.out.println("Fibonacci series upto " + n + " terms : ");

        int first = 0 , second = 1;

        for (int i = 1; i <= n ; i++) {
            System.out.print(first + "  ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
