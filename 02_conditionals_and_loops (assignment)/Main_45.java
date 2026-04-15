import java.util.Scanner;

public class Main_45 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF = " + a);
    } 
}
