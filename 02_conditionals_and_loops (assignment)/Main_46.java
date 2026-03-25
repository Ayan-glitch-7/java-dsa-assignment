import java.util.Scanner;

public class Main_46 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int x = a, y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;
        int lcm = (a * b) / hcf;

        System.out.println("LCM = " + lcm);
    }
}
