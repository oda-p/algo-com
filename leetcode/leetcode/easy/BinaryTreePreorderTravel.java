package leetcode.easy;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTravel {
    private final List<Integer> preorderTravels = new ArrayList<>();
    private void travel(TreeNode nowNode){
        if(nowNode == null){
            return;
        }
        preorderTravels.add(nowNode.val);
        travel(nowNode.left);
        travel(nowNode.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        travel(root);
        return preorderTravels;
    }
}
