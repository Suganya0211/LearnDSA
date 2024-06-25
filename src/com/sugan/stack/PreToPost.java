package com.sugan.stack;

import java.util.Stack;

public class PreToPost {
    static String preToPost(String pre_exp) {
        Stack<String> stack = new Stack<>();
        String result = "";
        for(int i = 0; i < pre_exp.length(); i++) {
            char c = pre_exp.charAt(i);
            if(Character.isLetter(c) && !stack.isEmpty() && !stack.peek().equals("*") && !stack.peek().equals("/")
                    && !stack.peek().equals("+") && !stack.peek().equals("-")) {
                String opr1 = stack.pop();
                String operator = "";
                operator = stack.pop();
                result = opr1 + c + operator;
                stack.push(result);
            } else {
                stack.push(c+ "");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        preToPost("*-A/BC-/AKL");
    }
}
