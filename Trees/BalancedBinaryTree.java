package Trees;

public class BalancedBinaryTree {
    class Bpair{
        int ht=-1;
        boolean isbal= true;
    }
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return check(root).isbal;
        }
        public Bpair check(TreeNode root){
            if(root==null){
                return new Bpair();
            }
            Bpair lsp=check(root.left);
            Bpair rsp= check(root.right);
            Bpair selfp= new Bpair() ;
            selfp.ht= Math.max(lsp.ht, rsp.ht) +1;
            int bf= Math.abs(lsp.ht- rsp.ht);
            selfp.isbal= lsp.isbal && rsp.isbal && bf<=1;
            return selfp;
        }
    }
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
}
