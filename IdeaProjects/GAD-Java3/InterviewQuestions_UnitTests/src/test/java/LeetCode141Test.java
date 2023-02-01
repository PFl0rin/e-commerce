import org.example.LeetCode141.LeetCode141;
import org.example.LeetCode141.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode141Test {
    LeetCode141 lt141 = new LeetCode141();

    @Test
    void checkHasCycle() {
        ListNode testNode = new ListNode(5);
        ListNode elem2 = new ListNode(2);
        ListNode elem3 = new ListNode(5);
        ListNode elem4 =  new ListNode(20);
        testNode.next = elem2;
        testNode.next.next = elem3;
        testNode.next.next.next = elem4;
        testNode.next.next.next.next = elem2;

        assertEquals(true, lt141.hasCycle(testNode));
    }

    @Test
    void hasNotCycle() {
        ListNode testNode = new ListNode(5);
        ListNode elem2 = new ListNode(2);
        ListNode elem3 = new ListNode(5);
        ListNode elem4 =  new ListNode(2);
        testNode.next = elem2;
        testNode.next.next = elem3;
        testNode.next.next.next = elem4;
//        testNode.next.next.next.next = elem2;

        assertEquals(false, lt141.hasCycle(testNode));
    }

    @Test
    void listOfAnSingleElementHasNotCycle() {
        ListNode testNode = new ListNode(5);

        assertEquals(false, lt141.hasCycle(testNode));
    }

    @Test
    void listOfAnSingleLoopElementHasCycle() {
        ListNode testNode = new ListNode(5);
        testNode.next = testNode;

        assertEquals(true, lt141.hasCycle(testNode));
    }
}
