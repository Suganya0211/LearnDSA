package com.sugan.stack;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingQueue {
    Deque<Integer> deque;
    public StackUsingQueue() {
        deque = new LinkedList<>();
    }

    public void push(int x) {
        deque.addFirst(x);
    }

    public int pop() {
        return deque.pollFirst();
    }

    public int top() {

        return deque.peek();
    }

    public boolean empty() {
        return deque.isEmpty();
    }
}
