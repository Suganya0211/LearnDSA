package com.sugan.linkedlist;

public class FindLength {
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int length = 0;
        Node temp = head;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
}
