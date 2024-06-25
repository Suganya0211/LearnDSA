package com.sugan.linkedlist;

public class Insert {
        //Function to insert a node at the beginning of the linked list.
        Node insertAtBeginning(Node head, int x)
        {
            Node temp = new Node(x);
            temp.next = head;

            return temp;
        }

        //Function to insert a node at the end of the linked list.
        Node insertAtEnd(Node head, int x)
        {
            if(head == null) {
                return new Node(x);
            }
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(x);
            return head;
        }
}
