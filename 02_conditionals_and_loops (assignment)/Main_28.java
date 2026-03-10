
import java.util.Scanner;

public class Main_28 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter units consumed : ");
        int units = in.nextInt();

        double bill = 0;

        if(units <= 100) {
            bill = (units * 5);
        }
        else if (units > 100 && units <= 200) {
            bill = ((100 * 5) + (units - 100) * 7);
        }
        else {
            bill = ((100 * 5) + (100 * 7) + (units - 200) * 10);
        }
        System.out.println("Electricity Bill : " + bill);
    }
}
