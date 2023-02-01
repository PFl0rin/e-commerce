package org.example.LeetCode141;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public void addElement(ListNode node, ListNode nextNode) {
        node.next = nextNode;
    }
}