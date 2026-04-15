import java.util.Scanner;

public class Main_41 {
    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact; 
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = in.nextInt();

        System.out.print("Enter value of r: ");
        int r = in.nextInt();

        if(r > n) {
            System.out.println("Invalid input!");
        } else {
            int nCr = factorial(n) / ((factorial(r) * factorial(n - r)));
            System.out.println("nCr (Combination) = " + nCr);

            int nPr = factorial(n) / factorial(n - r);
            System.out.println("nPr (Permutation) = " + nPr);
        }

        
    }
}
