import java.util.Scanner;

public class Main_06 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter money in rupees : ");
        Double rupees = in.nextDouble();

        Double dollars = rupees * 0.0109793588;
        System.out.println("Money in dollars : " + dollars);
    }
}