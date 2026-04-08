/* LEETCODE (# 1732) */


class Main_12 {
    public int largestAltitude(int[] gain) {
    
        int max = 0;
        int prev = 0;

        int[] ans = new int[gain.length + 1];

        ans[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            prev = prev + gain[i];
            ans[i] = prev;
            if (ans[i] > max) {
                max = ans[i];
            }
        }
        return max;
    }
}