import java.util.Scanner;

public class Main_34 {
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);

        System.out.print("Enter cost price : ");
        double costPrice = in.nextDouble();

        System.out.print("Enter salvage Value : ");
        double salvageValue = in.nextDouble();

        System.out.print("Enter useful years : ");
        int time = in.nextInt();


        double depreciation = (costPrice - salvageValue) / time;
        System.out.println("Yearly Depreciation: " + depreciation);
    }
}
