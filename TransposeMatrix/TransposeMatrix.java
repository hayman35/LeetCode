package TransposeMatrix;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int col = matrix[0].length; int row = matrix.length;
        int[][] res = new int[col][row];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return matrix;
    }
}
