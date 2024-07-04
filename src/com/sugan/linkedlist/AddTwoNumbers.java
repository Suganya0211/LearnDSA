package com.sugan.linkedlist;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }

        if(l2 == null) {
            return l1;
        }

        int add = l1.val + l2.val;
        ListNode result;
        int carry = 0;
        if(add > 9) {
            int val = add%10;
            carry = 1;
            result = new ListNode(val);
        } else {
            result = new ListNode(add);
        }

        ListNode temp = result;
        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            ListNode newNode;
            if(sum > 9) {
                carry = 1;
                newNode = new ListNode(sum%10);
            } else {
                newNode = new ListNode(sum);
                carry = 0;
            }
            result.next = newNode;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null) {
            int sum = l1.val + carry;
            ListNode newNode;
            if(sum > 9) {
                carry = 1;
                newNode = new ListNode(sum%10);
            } else {
                carry = 0;
                newNode = new ListNode(sum);
            }
            result.next = newNode;
            result = result.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            int sum = l2.val + carry;
            ListNode newNode;
            if(sum > 9) {
                carry = 1;
                newNode = new ListNode(sum%10);
            } else {
                newNode = new ListNode(sum);
                carry = 0;
            }
            result.next = newNode;
            result = result.next;
            l2 = l2.next;
        }

        if(carry == 1) {
            ListNode node = new ListNode(carry);
            result.next = node;
        }

        return temp;
    }
}