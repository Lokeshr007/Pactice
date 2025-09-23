package DSA.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Traversals
        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("Preorder: ");
        tree.preorder();

        System.out.print("Postorder: ");
        tree.postorder();

        // Search
        System.out.println("Search 40 → " + tree.search(40));
        System.out.println("Search 100 → " + tree.search(100));

        // Max Height
        DSA.Tree.MaxHeight.MaxHeightProblem mh = new DSA.Tree.MaxHeight.MaxHeightProblem();
        System.out.println("Max Height of Tree → " + mh.height(tree.root));
    }
}
