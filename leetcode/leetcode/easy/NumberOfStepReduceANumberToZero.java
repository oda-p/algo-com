package leetcode.easy;

public class NumberOfStepReduceANumberToZero {
    public int numberOfSteps(int num) {
        int i = 0;
        while(num != 0){
            if(num%2==0){
                num = num/2;
            }
            else{
                num -=1;
            }
            i++;
        }
        return i;
    }
}
