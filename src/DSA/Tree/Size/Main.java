package DSA.Tree.Size;

import DSA.Tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        SizeofBinaryTree s = new SizeofBinaryTree();
        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println(s.size(tree.root));
    }
}
