import java.util.Scanner;

public class Main_13 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter side : ");
        Double a = in.nextDouble();

        Double per = (4 * a);
        System.out.println("Perimeter of rhombus : " + per);
    }
}
