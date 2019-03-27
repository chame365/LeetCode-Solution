package problem;

public class P167 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        new P167().twoSum(nums, 9);
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            temp = numbers[left] + numbers[right];
            if (temp == target) {
                return new int[]{left + 1, right + 1};
            } else if (temp < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

}
