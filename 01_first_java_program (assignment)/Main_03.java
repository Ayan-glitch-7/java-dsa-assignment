
import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        int P = in.nextInt();

        System.out.print("Enter time (in years) : ");
        int T = in.nextInt();

        System.out.print("Enter rate of interest (in %): ");
        int R = in.nextInt();

        int SI = (P * R * T) / 100;
        System.out.println(" Simple interest = " + SI);

        int amount = P + SI;
        System.out.println(" Total amount is " + amount); 
    }
}