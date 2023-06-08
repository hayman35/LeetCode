package CodeSignal;

// https://app.codesignal.com/interview-practice/task/5A8jwLGcEpTPyyjTB/description
public class RotateImage {
    int[][] solution(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[][] sol = new int[col][row];
        for (int j = 0; j < col; j++){
            int k = 0;
            for (int i = row - 1; i >= 0; i--){
                sol[j][k] = a[i][j];
                k++;
            }
        }

        return sol;
    }
}
