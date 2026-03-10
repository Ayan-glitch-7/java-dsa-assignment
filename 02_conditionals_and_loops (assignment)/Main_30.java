
import java.util.Scanner;

public class Main_30 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter product price : ");
        double price = in.nextDouble();

        System.out.print("Enter discount rate : ");
        double discountrate = in.nextDouble();

        double discount = (discountrate * price) / 100;
        System.out.println("Discount : " + discount);

        double finalprice = (price - discount);
        System.out.println("Final price : " + finalprice);
    }
}
