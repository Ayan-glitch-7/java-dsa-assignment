
import java.util.Scanner;

public class Main_08 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = in.next();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }   
    }
}
