/* LEETCODE (# 867) */


class Main_17 {
    public int[][] transpose(int[][] matrix) {
    
        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j] ;
                ans[j][i] = temp;
            }
        }
        return ans;
    }
}