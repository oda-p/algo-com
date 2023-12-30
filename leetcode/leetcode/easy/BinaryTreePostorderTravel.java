package leetcode.easy;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTravel {
    private final List<Integer> postorderTravels = new ArrayList<>();
    private void travel(TreeNode nowNode){
        if(nowNode == null){
            return;
        }
        travel(nowNode.left);
        travel(nowNode.right);
        postorderTravels.add(nowNode.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        travel(root);
        return postorderTravels;
    }
}
