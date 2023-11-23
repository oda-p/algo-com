class Solution {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> elemetList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        boolean hasDuplicate = nums.length != elemetList.stream().distinct().count();
        return hasDuplicate;
    }
}