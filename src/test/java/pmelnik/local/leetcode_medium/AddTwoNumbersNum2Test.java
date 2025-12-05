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
        assertEquals(7, res.getVal());
        assertNotNull(res.getNext());
        assertEquals(0, res.getNext().getVal());
        assertNotNull(res.getNext().getNext());
        assertEquals(8, res.getNext().getNext().getVal());
        assertNull(res.getNext().getNext().getNext());
    }
}