package problem;

public class P566 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        new P566().matrixReshape(nums, 4, 1);
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums[0].length * nums.length != r * c) {
            return nums;
        }

        int[][] result = new int[r][c];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[count / c][count % c] = nums[i][j];
                count++;
            }
        }
        return result;
    }
}
