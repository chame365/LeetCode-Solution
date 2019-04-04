package problem;

public class P303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}

class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (j > nums.length - 1) {
            j = nums.length - 1;
        }
        if (i < 0) {
            i = 0;
        }

        int result = 0;
        for (int k = i; k <= j; k++) {
            result += nums[k];
        }

        return result;
    }
}
