public class Main_51 {
    public static void main(String[] args) {
        
        int count = 0;

        for (int day = 1; day <= 31; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of days Ayan can go out: " + count);
    }
}
