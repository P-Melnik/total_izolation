package pmelnik.local.leetcode_medium;

import org.junit.jupiter.api.Test;
import pmelnik.local.utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersNum2Test {

    AddTwoNumbersNum2 sut = new AddTwoNumbersNum2();

    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode res = sut.addTwoNumbers(l1, l2);

        assertNotNull(res);
        assertEquals(7, res.val);
        assertNotNull(res.next);
        assertEquals(0, res.next.val);
        assertNotNull(res.next.next);
        assertEquals(8, res.next.next.val);
        assertNull(res.next.next.next);
    }
}