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
import static java.lang.Math.max;

class Solution {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        this.search(root, 0);
        return this.maxDepth;
    }

    public void search(TreeNode root, int depth) {
        if(root == null){
            this.maxDepth = max(this.maxDepth, depth);
            return;
        }
        depth += 1;
        this.search(root.left, depth);
        this.search(root.right, depth);
    }
}