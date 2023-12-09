package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindPeaks {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for(int i = 1; i < mountain.length-1; i++){
            if(mountain[i-1] < mountain[i] && mountain[i] >mountain[i+1]){
                peaks.add(i);
            }
        }
        return peaks;
    }
}
