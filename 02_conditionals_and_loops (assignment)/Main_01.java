import java.util.Scanner;
 
public class Main_01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius : ");
        Double r = in.nextDouble();

        Double area = ( Math.PI * r * r);
        System.out.println("Area of circle : " + area);
    }
}