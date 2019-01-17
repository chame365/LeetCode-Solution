package problem;

import common.TreeNode;
import util.CreateTree;

public class P965 {
    public static void main(String[] args) {
        Integer[] nums = {2, 2, 2, 5, 2};
        new P965().isUnivalTree(CreateTree.process(nums, 0));
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != root.val) {
            return false;
        }

        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
