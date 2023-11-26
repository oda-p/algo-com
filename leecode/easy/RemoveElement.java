package easy;

class RemoveElement{
    class Solution {
        public int removeElement(int[] nums, int val) {
            if(nums.length == 0){
                return 0;
            }
            int[] newArray = new int[nums.length];
            int j = 0;
            for(int i=0; i < nums.length; i++){
                if(nums[i] != val){
                    newArray[j] = nums[i];
                    j += 1;
                }
            }
            for(int i=0; i < j; i++){
                nums[i] = newArray[i];
            }
            return j;
        }
    };
}