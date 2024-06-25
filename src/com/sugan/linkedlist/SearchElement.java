package com.sugan.linkedlist;

public class SearchElement {

    static boolean searchKey(int n, Node head, int key) {
        while(head != null) {
            if(head.data == key) {
                return true;
            }
            head = head.next;

        }

        return false;
    }
}
