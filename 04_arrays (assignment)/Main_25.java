/* LEETCODE (# 566) */


class Main_25 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int rows = mat.length;
        int cols = mat[0].length;

        if ((rows * cols) != (r * c)) {
            return mat;
        }

        int[][] ans = new int[r][c];
        int ans_rows = 0;
        int ans_cols = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[ans_rows][ans_cols] = mat[i][j];
                ans_cols++;

                if (ans_cols == c) {
                    ans_cols = 0;
                    ans_rows++;
                }
            }
        }
        return ans;
    }
}