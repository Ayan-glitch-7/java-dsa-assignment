
import java.util.Scanner;

public class Main_35 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total runs: ");
        double runs = in.nextDouble();

        System.out.print("Enter number of times out: ");
        int outs = in.nextInt();

        if (outs == 0) {
            System.out.println("Batting Average is undefined (player never got out) ");
        } else {
            double average = runs / outs;
            System.out.println("Batting Average: " + average);
        }
    }
}
