/* LEETCODE (# 1380) */


import java.util.ArrayList;
import java.util.List;


class Main_23 {
    public List<Integer> luckyNumbers(int[][] matrix) {
    
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minValue = matrix[i][0];
            int columnIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    columnIndex = j;
                }
            }

            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][columnIndex] > minValue) {
                    isLucky = false;
                }
            }

            if (isLucky == true) {
                ans.add(minValue);
            }
        }
        return ans;
    }
}