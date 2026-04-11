/* LEETCODE (# 1886) */


class Main_20 {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for (int k = 0; k < 4; k++) {
            if (isEqual(mat,target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }


    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = mat[n - j - 1][i];
            }
        }
        return ans;
    }


    public boolean isEqual(int[][] a, int[][] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                } 
            }
        }
        return true;
    }
}