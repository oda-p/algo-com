package leetcode.easy;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsums = new int[nums.length];
        int[] rightsums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                rightsums[i] += nums[j];
            }
            for (int j = i-1; j >= 0; j--) {
                leftsums[i] += nums[j];
            }
        }
        int[] answer = new int[nums.length];
        for( int i = 0; i < nums.length; i++)
        {
            answer[i] = Math.abs(leftsums[i] - rightsums[i]);
        }
        return answer;
    }
}