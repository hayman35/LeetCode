package CodeSignal;

import java.util.HashSet;

// https://app.codesignal.com/interview-practice/task/SKZ45AF99NpbnvgTn/description
// https://leetcode.com/problems/valid-sudoku/
public class Sudoku {
    boolean solution(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                char current_val = grid[i][j];
                if (current_val != '.'){
                    if (!seen.add(current_val + " found in row " + i)||
                            !seen.add(current_val + " found in col " + j)||
                            !seen.add(current_val + " found in subbox " + i/3 + " " + j/3)) return false;
                }
            }
        }
        return true;
    }
}
