import java.util.Scanner;

public class Main_17 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius : ");
        Double r = in.nextDouble();

        Double vol = ((4 / 3) * Math.PI * r * r * r);
        System.out.println("Volume of sphere : " + vol);
    }
}
