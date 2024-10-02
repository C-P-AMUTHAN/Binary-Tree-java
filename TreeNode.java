//Binary Tree

public class TreeNode {
    int data;
    TreeNode Node;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}
    public TreeNode(int data){
        this.data = data;
    }
    public TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
