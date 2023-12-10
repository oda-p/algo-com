package leetcode.easy;

import leetcode.TreeNode;

public class SymmetricTree {
    public boolean verifySymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null)
        {
            return true;
        }
        else if(left == null || right == null){
            return false;
        }
        else if(left.val != right.val){
            return false;
        }
        else{
            return verifySymmetric(left.left, right.right) && verifySymmetric(left.right, right.left);
        }

    }
    public boolean isSymmetric(TreeNode root) {
        return this.verifySymmetric(root.left, root.right);
    }
}
