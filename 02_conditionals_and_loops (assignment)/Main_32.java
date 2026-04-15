import java.util.Scanner;

public class Main_32 { 
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Sales Amount : ");
        double sales = in.nextDouble();

        System.out.print("Enter Commission Percentage : ");
        double rate = in.nextDouble();

        double commission = (sales * rate) / 100;

        System.out.println("Commission Amount : " + commission);
    }
}