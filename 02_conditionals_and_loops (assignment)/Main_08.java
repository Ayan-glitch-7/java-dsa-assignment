import java.util.Scanner;

public class Main_08 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius : ");
        Double r = in.nextDouble();

        Double per = (2 * Math.PI * r);
        System.out.println("Perimeter of circle : " + per);
    }
}
