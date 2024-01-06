package leetcode.easy;

public class XorOperationsInArray {
    public int xorOperation(int n, int start) {
        int totalXor = start;
        for(int i=1; i < n; i++){
            totalXor = totalXor^(start + 2 * i);
        }
        return totalXor;
    }
}
