package leetcode.easy;

import java.util.Arrays;

public class MinumumNumberGame {
    public int[] numberGame(int[] nums) {
        int[] new_nums = new int[nums.length];
        Arrays.sort(nums);
        for( int i = 0; i < nums.length; i=i+2){
            new_nums[i+1] = nums[i];
            new_nums[i] = nums[i+1];
        }
        return new_nums;
    }
}
