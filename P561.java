package problem;

import java.util.Arrays;

public class P561 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        new P561().arrayPairSum(nums);
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
