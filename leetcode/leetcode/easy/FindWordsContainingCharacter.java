package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<Integer>();
        String str_x = Character.toString(x);
        for(int i = 0; i < words.length; i++){
            if(words[i].contains(str_x)){
                list.add(i);
            }
        }
        return list;
    }

}
