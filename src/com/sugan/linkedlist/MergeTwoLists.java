package com.sugan.linkedlist;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }

        if(list2 == null) {
            return list1;
        }
        ListNode result, temp = null;
        if(list1.val < list2.val) {
            result = list1;
            temp = list1;
            list1 = list1.next;
        } else {
            result = list2;
            temp = list2;
            list2 = list2.next;
        }

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        if(list1 != null) {
            temp.next = list1;
        }

        if(list2 != null) {
            temp.next = list2;
        }

        return result;
    }
}
