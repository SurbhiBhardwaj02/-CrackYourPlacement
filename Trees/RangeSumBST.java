package Trees;

public class RangeSumBST {


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
        public int rangeSumBST(TreeNode root, int L, int R) {
            if(root == null)
                return 0;
            int sum=0;
            //explore left sub-tree
            if(root.val>L){
                sum+= rangeSumBST(root.left, L , R);
            }
            //read the value of root
            if(root.val>=L && root.val<=R){
                sum += root.val;
            }
            //explore right-subtree
            if(root.val<R){
                sum += rangeSumBST(root.right, L , R);
            }
            return sum;
        }
    }
}
