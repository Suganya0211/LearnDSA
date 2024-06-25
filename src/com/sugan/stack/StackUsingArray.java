package com.sugan.stack;

public class StackUsingArray {
        int top;
        int arr[] = new int[1000];

        StackUsingArray()
        {
            top = -1;
        }

        //Function to push an integer into the stack.
        void push(int a)
        {
            top++;
            arr[top] = a;
        }

        //Function to remove an item from top of the stack.
        int pop()
        {
            if(top == -1)
                return -1;
            int ele = arr[top];
            top--;
            return ele;
        }
}
