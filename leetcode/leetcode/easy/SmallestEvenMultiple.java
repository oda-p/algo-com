package leetcode.easy;

public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        int a = n;
        while(a%2 != 0){
            a = a * 2;
        }
        return a;
    }
}
