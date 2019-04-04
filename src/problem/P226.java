package problem;

import common.TreeNode;

public class P226 {
    TreeNode left, right;

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        left = invertTree(root.right);
        right = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }
}
