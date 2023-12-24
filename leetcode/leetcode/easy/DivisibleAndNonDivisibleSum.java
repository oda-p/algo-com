package leetcode.easy;

public class DivisibleAndNonDivisibleSum {
    public int differenceOfSums(int n, int m) {
        int dividedSum = 0;
        int nonDividedSum = 0;
        for( int i = 1; i <= n; i++)
        {
            if( i % m != 0){
                nonDividedSum += i;
            }
            else{
                dividedSum += i;
            }
        }
        return nonDividedSum - dividedSum;
    }
}
