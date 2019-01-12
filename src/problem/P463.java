package problem;

public class P463 {
    public static void main(String[] args) {
        int[][] grid = {{1,0}};
        new P463().islandPerimeter(grid);
    }
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    // up
                    if (i - 1 < 0 || grid[i-1][j] == 0){
                        perimeter++;
                    }
                    // low
                    if (i + 1 >= grid.length || grid[i+1][j] == 0){
                        perimeter++;
                    }
                    if (j - 1 < 0 || grid[i][j-1] == 0) {
                        perimeter ++;
                    }
                    if (j + 1 >= grid[i].length || grid[i][j+1] == 0){
                        perimeter++;
                    }
                }
            }
        }

        return perimeter;
    }
}
