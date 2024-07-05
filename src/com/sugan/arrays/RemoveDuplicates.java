package com.sugan.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int index = 0;
        for(int i : set) {
            nums[index] = i;
            index++;
        }
        return set.size();
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
