package problem;

import common.TreeNode;
import util.CreateTree;

public class P100 {
    public static void main(String[] args) {
        Integer[] pNums = {1, 2, 3};
        Integer[] qNums = {1, 2, 3};

        TreeNode p = CreateTree.process(pNums, 0);
        TreeNode q = CreateTree.process(qNums, 0);

        new P100().isSameTree(p, q);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if ((p == null && q == null)) {
            return true;
        } else if ((p != null && q == null) || (q != null && p == null) || p.val != q.val) {
            return false;
        } else if (p.left == null && q.left == null && p.right == null && q.right == null) {
            return true;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
