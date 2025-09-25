package DSA.Tree.Size;

import DSA.Tree.BinaryTree;
import DSA.Tree.Node;

public class SizeofBinaryTree {
    BinaryTree t = new BinaryTree();
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        int l = size(root.left);
        int r = size(root.right);
        return 1+l+r;
    }
}
