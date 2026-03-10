
import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.print("Enter operator (+,-,*,/) : ");
        char op = in.next().charAt(0);

        if (op == '+') {
            System.out.println("Sum : " + (num1 + num2));
        }
        else if (op == '-') {
            System.out.println("Subtract : " + (num1 - num2));
        }
        else if (op == '*') {
            System.out.println("Mu.tiply : " + (num1 * num2));
        }
        else if (op == '/') {
            System.out.println("Divide : " + (num1 / num2));
        }
        else {
            System.out.println("Invalid");
        }
    }
}
