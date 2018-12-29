package problem;

import common.TreeNode;

public class P104 {
    public static void main(String[] args) {
        Math.max()
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
