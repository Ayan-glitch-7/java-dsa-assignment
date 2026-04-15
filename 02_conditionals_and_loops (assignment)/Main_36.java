
import java.util.Scanner;

public class Main_36 { 
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double grade = in.nextDouble();
            sum = sum + grade;
        }

        double cgpa = sum / n;

        System.out.println("CGPA: " + cgpa);
    }
}

