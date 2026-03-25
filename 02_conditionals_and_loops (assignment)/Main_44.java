import java.util.Scanner;

public class Main_44 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = in.nextDouble();

        System.out.print("Enter number of years: ");
        int years = in.nextInt();

        rate = rate / 100;

        double futureValue = principal * Math.pow(1 + rate, years);

        System.out.printf("Future Investment Value = %.2f", futureValue);
    }
}
