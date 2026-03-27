
import java.util.Scanner;

public class Main_09 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        int ans = factorial(num);
        System.out.println(ans);
    }

    static int factorial (int num) {
        int fact = 1;

        if (num == 0 || num == 1) {
            fact = 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return  fact;
    }
}
