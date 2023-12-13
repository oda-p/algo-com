package leetcode.easy;

import leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    Set<ListNode> visited = new HashSet<ListNode>();
    public boolean hasCycle(ListNode head) {
        ListNode now = head;
        while(now != null){
            if(visited.contains(now)){
                return true;
            }
            visited.add(now);
            now = now.next;
        }
        return false;
    }
}
