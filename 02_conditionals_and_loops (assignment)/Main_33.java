import java.util.Scanner;

public class Main_33 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter base number : ");
        double base = in.nextDouble();

        System.out.print("Enter exponent : ");
        double exponent = in.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println("Result : " + result);
    }
}