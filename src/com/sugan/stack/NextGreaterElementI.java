package com.sugan.stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();

        int m = nums1.length;
        int n = nums2.length;

        for(int i = n-1; i >=0 ; i--) {
            while(!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                map.put(nums2[i], stack.peek());
            } else {
                map.put(nums2[i], -1);
            }

            stack.push(nums2[i]);
        }

        int[] result = new int[m];
        for(int i =0; i < m; i++) {
            result[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
        }

        return result;
    }
}
