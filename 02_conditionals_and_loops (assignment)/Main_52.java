import java.util.Scanner;

public class Main_52 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int num;
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = in.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                negativeSum = negativeSum + num;
            } 
            else if (num % 2 == 0) {
                positiveEvenSum = positiveEvenSum + num;
            } 
            else {
                positiveOddSum = positiveOddSum + num;
            }
        }

        System.out.println("Sum of Negative Numbers = " + negativeSum);
        System.out.println("Sum of Positive Even Numbers = " + positiveEvenSum);
        System.out.println("Sum of Positive Odd Numbers = " + positiveOddSum);
    }
}
