package leetcode.easy;

import leetcode.TreeNode;

public class PathSum {
    public boolean findTargetSum(TreeNode node, int sum, int target){
        boolean result = false;
        if(node == null){
            return false;
        }
        if(node.left != null){
            result = result || this.findTargetSum(node.left, node.val + sum, target);
        }
        if(node.right != null){
            result = result || this.findTargetSum(node.right, node.val + sum, target);
        }
        if(result == true){
            return result;
        }
        if(node.left == null && node.right == null){
            result = result || (sum+node.val) == target;
        }
        return result;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return this.findTargetSum(root, 0, targetSum);
    }
}
