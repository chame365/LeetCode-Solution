package problem;

public class P268 {
    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        new P268().missingNumber(nums);
    }

    public int missingNumber(int[] nums) {
        int result = nums[0];
        for (int i = 0; i <= nums.length; i++) {
            if (1 <= i && i < nums.length){
                result ^= nums[i];
            }
            result ^= i;
        }

        return result;
    }
}
