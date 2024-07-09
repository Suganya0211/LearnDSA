package com.sugan.stack;

import java.util.Stack;

class Pair {
        int element;
        int min;

public Pair(int element, int min) {
        this.element = element;
        this.min = min;
        }
        }
class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new Pair(val, val));
        } else {
            if (val < stack.peek().min)
                stack.push(new Pair(val, val));
            else {
                stack.push(new Pair(val, stack.peek().min));
            }
        }

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().element;
    }

    public int getMin() {
        return stack.peek().min;
    }
}