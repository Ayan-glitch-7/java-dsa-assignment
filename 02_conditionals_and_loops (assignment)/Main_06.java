import java.util.Scanner;
 
public class Main_06 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first diagnol : ");
        Double d1 = in.nextDouble();

        System.out.print("Enter second diagnol : ");
        Double d2 = in.nextDouble();

        Double area = (0.5 * d1 * d2);
        System.out.println("Area of rhombus : " + area);
    }
}
