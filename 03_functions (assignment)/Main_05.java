
import java.util.Scanner;

public class Main_05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("number 1 : ");
        int num1 = in.nextInt();

        System.out.print("number 2 : ");
        int num2 = in.nextInt();

        int ans = product(num1, num2);
        System.out.println("Product is " + ans);
    }

    static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }
}
