package leetcode.easy;

import static java.lang.Math.max;
import leetcode.TreeNode;

class MaximumDepthOfBinaryTree {
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
