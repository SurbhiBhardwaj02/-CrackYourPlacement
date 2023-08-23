package Trees;

public class SymmetricTree {
    class TreeNode {
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
        public boolean isSymmetric(TreeNode root) {
            return Mirror(root.left,root.right);
        }
        public boolean Mirror(TreeNode r1,TreeNode r2){
            if(r1==null && r2==null) return true;
            if(r1==null || r2==null) return false;
            if(r1.val!=r2.val) return false;

            boolean left= Mirror(r1.left, r2.right);
            boolean right= Mirror(r1.right,r2.left);
            return left && right;


        }
    }
}
