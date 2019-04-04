package problem;

import java.util.Arrays;

public class P628 {
    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1, 60};
        new P628().maximumProduct(nums);
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
