import java.util.Scanner;

public class Main_14 {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        sum(num);
    }

    static void sum (int num) {

        int s = 0;

        for (int i = 1; i <= num; i++) {
            s = s + i;
        }
        System.out.println("Sum of natural numbers is " + s);
    }
}
