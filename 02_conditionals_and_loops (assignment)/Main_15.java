import java.util.Scanner;
 
public class Main_15 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length : ");
        Double l = in.nextDouble();

        System.out.print("Enter width : ");
        Double w = in.nextDouble();

        System.out.print("Enter height : ");
        Double h = in.nextDouble();

        Double vol = (l * w * h);
        System.out.println("Volume of prism : " + vol);
    }
}
