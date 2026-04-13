/* LEETCODE (# 26) */


class Main_27 {
    public int removeDuplicates(int[] nums) {
        
        int k = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}