import java.util.Scanner;

public class Main_10 {  
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter one side : ");
        Double a = in.nextDouble();

        System.out.print("Enter adjacent side : ");
        Double b = in.nextDouble();

        Double per = (2 * (a + b));
        System.out.println("Perimeter of parallelogram : " + per);
    }
}
