package com.sugan.stack;

import java.util.Stack;

public class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = (2*n) -1; i >= 0; i-- ) {
            while(!stack.isEmpty() && nums[i%n] >= stack.peek()) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                result[i%n] = stack.peek();
            } else {
                result[i%n] = -1;
            }
            stack.push(nums[i%n]);
        }

        return result;
    }
}
