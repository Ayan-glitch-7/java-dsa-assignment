
import java.util.Scanner;

public class Main_38 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = in.nextDouble();
            sum += marks;
        }

        double average = sum / n;

        System.out.println("Average Marks: " + average);
    }
}

