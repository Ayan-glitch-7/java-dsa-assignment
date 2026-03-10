import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter equal sides : ");
        Double a = in.nextDouble();

        System.out.print("Enter base : ");
        Double b = in.nextDouble();

        Double area = ((b / 4) * Math.sqrt((4 * a * a) - (b * b)));
        System.out.println("Area of isosceles triangle : " + area);
    }
}
