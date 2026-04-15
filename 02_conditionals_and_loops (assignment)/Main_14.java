import java.util.Scanner;
 
public class Main_14 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius : ");
        Double r = in.nextDouble();

        System.out.print("Enter height : ");
        Double h = in.nextDouble();

        Double vol = ((1.0 / 3) * Math.PI * r * r * h);
        System.out.println("Volume of cone : " + vol);
    }
}
