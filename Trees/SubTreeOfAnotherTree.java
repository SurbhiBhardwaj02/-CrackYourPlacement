package Trees;

public class SubTreeOfAnotherTree {
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
        boolean ans=false;
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            inOrder(root, subRoot);
            return ans;
        }
        public void inOrder(TreeNode root, TreeNode subroot){
            if(root!=null){
                inOrder(root.left, subroot);
                boolean x= isIdentical(root,subroot);
                if(x) ans=x;
                inOrder(root.right, subroot);
            }
        }
        public boolean isIdentical(TreeNode root, TreeNode subroot){
            if(root!=null && subroot!=null){
                boolean m= isIdentical(root.left,subroot.left);
                boolean n= isIdentical(root.right, subroot.right);
                if(root.val==subroot.val && m && n){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(root== null && subroot== null){
                return true;
            }
            else{
                return false;
            }

        }
    }
}
