package Trees;

public class LowestCommonAncestor {
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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root==null) return null;
            int curr= root.val;
            if(curr<p.val && curr< q.val){
                return lowestCommonAncestor(root.right, p, q);
            }
            if(curr>p.val && curr> q.val){
                return lowestCommonAncestor(root.left, p, q);
            }
            return root;
        }
    }
}
