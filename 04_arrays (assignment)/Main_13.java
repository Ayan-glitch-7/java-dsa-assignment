/* LEETCODE (# 832) */


class Main_13 {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int[][] ans = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j ++) {
                if (image[i][j] == 0) {
                    ans[i][image[i].length - j -1] = 1;
                } else if (image[i][j] == 1) {
                    ans[i][image[i].length - j -1] = 0;
                }
            }
        }
        return ans;
    }
}