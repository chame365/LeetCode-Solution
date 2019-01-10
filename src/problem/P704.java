package problem;

public class P704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        new P704().search(nums, 19);
    }

    public int search(int[] nums, int target) {
        if (target < nums[0] || nums[nums.length-1] < target){
            return -1;
        }
        int low = 0;
        int high = nums.length;
        while (low <= high){
            int mid = (low + high) / 2;
            int midValue = nums[mid];
            if (midValue == target){
                return mid;
            } else if (midValue > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
