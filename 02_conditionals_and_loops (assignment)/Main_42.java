
import java.util.Scanner;

public class Main_42 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String a = in.next();

        String Reverse = ""; 

        for (int i = a.length() - 1; i >= 0; i--) {
            Reverse = Reverse + a.charAt(i);
        }
        System.out.println("Reversed String: " + Reverse);
    }
}