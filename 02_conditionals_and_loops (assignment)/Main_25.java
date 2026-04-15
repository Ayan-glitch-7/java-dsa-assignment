
import java.util.Scanner; 

public class Main_25 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers : ");
        int n = in.nextInt();
        int max = n;

        while (n != 0) {
                n = in.nextInt();
                if (n > max) {
                    max = n;
                }
        }
        System.out.println("Largest number : " + max);
    }
}
