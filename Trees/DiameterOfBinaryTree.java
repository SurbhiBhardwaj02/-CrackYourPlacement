class Diapair{
    int ht=-1;
    int d=0;
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }
    public Diapair diameter(TreeNode root){
        if(root==null){
            return new Diapair();
        }
        Diapair left=diameter(root.left);
        Diapair right=diameter(root.right);
        Diapair self= new Diapair();

        self.ht= Math.max(left.ht,right.ht)+1;
        int selfdia = left.ht+right.ht+2;
        self.d= Math.max(left.d,Math.max(right.d,selfdia));
        return self;
    }
}
