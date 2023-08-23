package Trees;

public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            return invert(root);
        }
        public TreeNode invert(TreeNode root){
            if(root==null){
                return root;
            }
            TreeNode temp= root.left;
            root.left=root.right;
            root.right= temp;
            invert(root.right);
            invert(root.left);
            return root;
        }
    }
}
