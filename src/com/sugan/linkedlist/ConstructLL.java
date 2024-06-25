package com.sugan.linkedlist;

public class ConstructLL {
    static Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i =1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }
}
