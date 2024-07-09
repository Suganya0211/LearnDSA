package com.sugan.linkedlist;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;

        ListNode oddList = head;
        ListNode evenList = head.next;
        ListNode evenHead = evenList;

        while(oddList != null && oddList.next != null && evenList != null && evenList.next != null) {
            oddList.next = evenList.next;
            oddList = oddList.next;
            evenList.next = oddList.next;
            evenList = evenList.next;
        }

        oddList.next = evenHead;
        return head;

    }
}
