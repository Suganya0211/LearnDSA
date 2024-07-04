package com.sugan.stack;

import java.util.Stack;

public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i < num.length(); i++) {
            int digit = Integer.parseInt(num.charAt(i)+"");
            while(!stack.isEmpty() && digit <= stack.peek() && k>0) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty());
            result.append(stack.pop());

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        removeKdigits("1432219", 3);
    }
}
