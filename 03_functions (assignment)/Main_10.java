
import java.util.Scanner;

public class Main_10 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        palindrome(num);
    }

    static void palindrome (int num) {
        int n = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit ;
            num = num / 10;
        }
        
        if (rev == n) {
            System.out.println(n + " is palindrome");
        }
        else {
            System.out.println(n + " is not palindrome");
        }
        
    }
}
