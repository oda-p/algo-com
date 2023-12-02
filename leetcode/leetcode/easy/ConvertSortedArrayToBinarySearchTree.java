package leetcode.easy;
import leetcode.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    public TreeNode getSubTreeNode(int[] nums, int left, int right){
        if ( left > right ) {
            return null;
        }
        System.out.println("(" + left + ", " + right + ")");
        int mid = left + (right - left ) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getSubTreeNode(nums, left, mid-1);
        root.right = getSubTreeNode(nums, mid + 1, right);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return getSubTreeNode(nums, 0, nums.length-1);
    }
}
