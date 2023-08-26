package Trees;

public class MinAbsDiffInBST {
    class Solution {
        int minDiff=Integer.MAX_VALUE;
        TreeNode prev= null;
        public int getMinimumDifference(TreeNode root) {
            if(root==null){
                return minDiff;
            }
            getMinimumDifference(root.left);
            if(prev!=null){
                minDiff= Math.min(minDiff, Math.abs(root.val- prev.val));
            }
            prev= root;
            getMinimumDifference(root.right);
            return minDiff;
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
