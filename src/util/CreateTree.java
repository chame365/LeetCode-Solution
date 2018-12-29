package util;

import common.TreeNode;

public class CreateTree {
    public static TreeNode process(Integer[] nums, Integer index) {
        TreeNode tn = null;
        Integer val;
        if (index < nums.length) {
            val = nums[index];
            if (val == null) {
                return null;
            }
            tn = new TreeNode(val);
            tn.left = process(nums, 2 * index + 1);
            tn.right = process(nums, 2 * index + 2);
        }
        return tn;
    }
}
