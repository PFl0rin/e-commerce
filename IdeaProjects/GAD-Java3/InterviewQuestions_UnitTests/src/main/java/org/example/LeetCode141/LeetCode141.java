package org.example.LeetCode141;

import java.util.HashSet;
import java.util.Set;



public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();

        while(head != null) {

            if(set.contains(head)) {
                return true;
            }
            set.add(head);

            head = head.next;
        }

        return false;
    }
}
