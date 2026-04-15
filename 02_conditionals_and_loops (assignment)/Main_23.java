
import java.util.Scanner;
 
public class Main_23 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Emter number : ");
        int n = in.nextInt();

        System.out.println("Factors of " + n + " : ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
