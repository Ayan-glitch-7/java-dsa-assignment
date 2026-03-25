import java.util.Scanner;

public class Main_47 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Consonant");
        } 
        else {
            System.out.println("Invalid Input");
        }
    }
}
