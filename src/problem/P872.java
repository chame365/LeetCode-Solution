package problem;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P872 {
    public static void main(String[] args) {

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder leftValue1 = new StringBuilder();
        StringBuilder leftValue2 = new StringBuilder();
        findLeftValue(root1, leftValue1);
        findLeftValue(root2, leftValue2);
        return leftValue1.toString().contentEquals(leftValue2);

    }

    private void findLeftValue(TreeNode root, StringBuilder leftValue) {
        if (root.left == null && root.right == null) {
            leftValue.append(root.val);
            return;
        }

        if (root.left != null) {
            findLeftValue(root.left, leftValue);
        }

        if (root.right != null) {
            findLeftValue(root.right, leftValue);
        }
    }


}
