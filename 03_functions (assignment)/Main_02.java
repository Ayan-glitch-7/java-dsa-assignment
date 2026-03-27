
import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        int ans = odd_even(num);
    }

    static int odd_even(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else if (num % 2 != 0) {
            System.out.println(num + " is odd");
        }
        else {
            System.out.println("invalid");
        }
        return num;
    }
}
