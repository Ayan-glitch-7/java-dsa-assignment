
import java.util.Scanner;

public class Main_13 {
    public static void main(String[] args) {
        
        Scanner in = new  Scanner(System.in);

        System.out.print("enter first number : ");
        int num1 = in.nextInt();

        System.out.print("enter second number : ");
        int num2 = in.nextInt();

        prime(num1, num2);
    }
    
    static void prime (int num1, int  num2) {

        for (int i = num1; i <= num2; i++) {

            if (i <= 1) {
                continue;
            }

            int j;
            for ( j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    break;
                }
            }
            
            if (j > i / 2) {
                System.out.println(i);
            }            
        }
    }
}
