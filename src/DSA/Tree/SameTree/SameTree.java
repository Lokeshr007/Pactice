package DSA.Tree.SameTree;

import javax.swing.tree.TreeNode;

public class SameTree {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // Base case: if both trees are null, they are identical

            // Recursively check if the left and right subtrees are identical
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

}
