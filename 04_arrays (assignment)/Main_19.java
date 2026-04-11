/* LEETCODE (# 1854) */


class Main_19 {
    public int maximumPopulation(int[][] logs) {
        
        int[] count = new int[200];
        int max = 0;
        int year = 0;

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                count[j - 1900]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                year = i + 1900;
            }
        }
        return year;
    }
}