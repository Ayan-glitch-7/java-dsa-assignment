import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base : ");
        Double b = in.nextDouble();

        System.out.print("Enter height : ");
        Double h = in.nextDouble();

        Double area = (0.5 * b * h);
        System.out.println("Area of trianle : " + area);
    }
}
