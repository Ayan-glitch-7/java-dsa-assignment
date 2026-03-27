
import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("first number : ");
        int first = in.nextInt();

        System.out.print("second number : ");
        int second = in.nextInt();

        System.out.print("third number : ");
        int third = in.nextInt();

        int MAX = max(first, second, third);
        System.out.println("Max value is " + MAX);

        int MIN = min(first, second, third);
        System.out.println("Min value is " + MIN);
    }

    static int max(int first,int second,int third) {
        int max = first;

        if (second > max) {
            max = second;
        } 
        if (third > max) {
            max = third;
        } 
        return max;
    }

    static int min(int first,int second,int third) {
        int min = first;

        if (second < min) {
            min = second;
        } 
        if (third < min) {
            min = third;
        } 
        return min;
    }
}
