package pmelnik.local.utils;

public class ListNode {

    int val;

    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode nextNode) {
        this.val = val;
        this.next = nextNode;
    }

}
