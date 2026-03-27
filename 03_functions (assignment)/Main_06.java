
import java.util.Scanner;

public class Main_06 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("enter radius : ");
        int rad = in.nextInt();

        double AREA = area(rad);
        System.out.println("Area of circle is " + AREA);

        double CIRCUMFERENCE = cimcum(rad);
        System.out.println("Circumference of circle is " + CIRCUMFERENCE);

    }

    static double area(int rad) {
        double area = Math.PI * rad * rad;
        return area;
    }

    static double cimcum(int rad) {
        double circum = 2 * Math.PI * rad;
        return circum;
    }
}
