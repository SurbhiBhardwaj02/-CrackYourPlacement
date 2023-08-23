package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinayTreePaths {
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans= new ArrayList<>();
            String curr_str=String.valueOf(root.val);
            if(root.left==null && root.right==null) ans.add(curr_str);
            if(root.left!=null){
                dfs(root.left, curr_str, ans);
            }
            if(root.right!=null){
                dfs(root.right, curr_str, ans);
            }
            return ans;
        }
        public void dfs(TreeNode root, String curr_str, List<String> ans){
            curr_str+= "->"+ String.valueOf(root.val);
            if(root.left==null && root.right==null){
                ans.add(curr_str);
                return;
            }
            if(root.left!=null){
                dfs(root.left, curr_str, ans);
            }
            if(root.right!=null){
                dfs(root.right, curr_str, ans);
            }

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
