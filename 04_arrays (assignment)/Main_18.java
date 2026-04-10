/* LEETCODE (# 989) */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main_18 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k = k + num[i];
                i--;
            }
            ans.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}