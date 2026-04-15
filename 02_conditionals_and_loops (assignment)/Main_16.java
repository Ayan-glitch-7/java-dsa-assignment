import java.util.Scanner;

public class Main_16 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius : ");
        Double r = in.nextDouble();
 
        System.out.print("Enter height : ");
        Double h = in.nextDouble();

        Double vol = (Math.PI * r * r * h);
        System.out.println("Volume of cylinder : " + vol);
    }
}
