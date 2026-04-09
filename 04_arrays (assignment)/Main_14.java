/* LEETCODE (# 1252) */


class Main_14 {
    public int oddCells(int m, int n, int[][] indices) {

        int[][] mat = new int[m][n];
        int count = 0;

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < m; j++) {
                    mat[j][col]++;
            }
            
            for (int j = 0; j < n; j++) {
                    mat[row][j]++;
            }

            
        }

        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                if (mat[j][k] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}