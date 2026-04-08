/* LEETCODE (# 1470) */


class Main_05 {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length/2; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }
}