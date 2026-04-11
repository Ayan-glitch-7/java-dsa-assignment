/* LEETCODE (# 1304) */


class Main_22 {
    public int[] sumZero(int n) {
        
        int[] ans = new int[n];
        int a = 1;

        if (n % 2 == 0) {
            int i = 0;
            while (i < n) {
                ans[i++] = a;
                ans[i++] = -a;
                a++;
            }
        } else if (n % 2 != 0) {
            int i = 0;
            while (i < n-1) {
                ans[i++] = a;
                ans[i++] = -a;
                a++;
            }
            ans[i] = 0;
        }
        return ans;
    }
}
