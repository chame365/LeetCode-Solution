package problem;

public class P506 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4};
        new P506().findRelativeRanks(nums);
    }

    public String[] findRelativeRanks(int[] nums) {
        int[] index = new int[nums.length];
        String[] result = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int max = 0;
            for(int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            index[i] = max;
            nums[max] = -1;
        }
        for(int i = 0; i < nums.length; i++) {
            if (i == 0){
                result[index[i]] = "Gold Medal";
            } else if (i == 1){
                result[index[i]] = "Silver Medal";
            }else if (i == 2){
                result[index[i]] = "Bronze Medal";
            } else {
                result[index[i]] = String.valueOf(i+1);
            }


        }
        return result;
    }
}
