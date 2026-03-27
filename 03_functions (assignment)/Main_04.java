
import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("number 1 : ");
        int num1 = in.nextInt();

        System.out.print("number 2 : ");
        int num2 = in.nextInt();

        int ans = add(num1, num2);
        System.out.println("Sum is " + ans);
    }

    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
