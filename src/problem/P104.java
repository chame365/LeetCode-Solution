package problem;

import common.TreeNode;
import util.CreateTree;

public class P104 {
    public static void main(String[] args) {
        Integer[] nums = {3,9,20,null,null,15,7};
        TreeNode root = CreateTree.process(nums,0);
        new P104().maxDepth(root);
    }

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
