import java.util.Scanner;
 
public class Main_07 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side : ");
        Double a = in.nextDouble();

        Double area = ((Math.sqrt(3) / 4) * (a * a)) ;
        System.out.println("Area of equilateral triangle : " + area);
    }
}
