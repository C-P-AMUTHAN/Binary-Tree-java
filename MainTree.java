public class MainTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        TreeTraversal t = new TreeTraversal();
        System.out.print("Binary Tree PreOrder Traversal: ");
        t.preOrderTraversal(root);
        System.out.println();
        System.out.print("Binary Tree PostOrder Traversal: ");
        t.postOrderTraversal(root);
        System.out.println();
        System.out.print("Binary Tree InOrder Traversal: ");
        t.inOrderTraversal(root);
    }
}