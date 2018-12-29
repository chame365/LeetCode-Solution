package problem;

import java.util.HashSet;
import java.util.Set;

public class P349 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 2};
        new P349().intersection(nums1, nums2);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resultSet = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    resultSet.add(num1);
                    break;
                }
            }
        }
        int[] result = new int[resultSet.size()];
        int temp = 0;
        for (int r : resultSet) {
            result[temp++] = r;
        }
        return result;
    }
}
