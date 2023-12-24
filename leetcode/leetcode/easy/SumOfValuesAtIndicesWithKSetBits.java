package leetcode.easy;

import java.util.List;

public class SumOfValuesAtIndicesWithKSetBits {
    public int getSetBitsNum(int number){
        String binaryString = Integer.toBinaryString(number);

        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            if(getSetBitsNum(i) == k){
                System.out.println(nums.get(i));
                sum += nums.get(i);
            }
        }
        return sum;


    }
}
