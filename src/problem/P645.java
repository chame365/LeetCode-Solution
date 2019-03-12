package problem;

public class P645 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        new P645().findErrorNums(nums);
    }

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0){
                result[0] = Math.abs(num);
            } else {
                nums[Math.abs(num) - 1] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[1] = i+1;
            }
        }
        return result;
    }
}
