
import java.util.Scanner;

public class Main_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter rate of interest (%): ");
        double rate = in.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = in.nextDouble();


        double amount = principal * Math.pow(1 + rate / 100, time);
        double compoundInterest = amount - principal;

        System.out.println("Final Amount: " + amount);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}

