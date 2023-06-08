package Islands;

// https://leetcode.com/problems/number-of-islands/

/*
Here the trick is to check whenever a 1 appears then have a seperate function check all around that 1 to see if either their are other ones
or there's a zero or boarders which are also water and it keeps searching until it goes through all of 1s
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    clearLand(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void clearLand(int i, int j,char[][] grid){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';

        clearLand(i+1,j,grid);
        clearLand(i,j+1,grid);
        clearLand(i-1,j,grid);
        clearLand(i,j-1,grid);
    }
}
