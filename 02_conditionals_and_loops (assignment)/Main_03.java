
import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length : ");
        Double l = in.nextDouble();

        System.out.print("Enter breadth : ");
        Double b = in.nextDouble();

        Double area = (l * b);
        System.out.println("Area of rectangle : " + area);
    }
}
