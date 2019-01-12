package problem;

public class P807 {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        new P807().maxIncreaseKeepingSkyline(grid);
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int[] horizontalRow = new int[grid.length];
        int[] verticalRow = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            horizontalRow[i] = maxNumOfArray(grid[i]);
            int[] verticalTemp = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                verticalTemp[j] = grid[j][i];
            }
            verticalRow[i] = maxNumOfArray(verticalTemp);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                result += (Math.min(horizontalRow[i],verticalRow[j]) - grid[i][j]);
            }
        }
        return result;
    }

    public int maxNumOfArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

}
