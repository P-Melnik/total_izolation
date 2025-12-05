package pmelnik.local.utils;

import lombok.Getter;

@Getter
public class ListNode {

    int val;

    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode nextNode) {
        this.val = val;
        this.next = nextNode;
    }

}
