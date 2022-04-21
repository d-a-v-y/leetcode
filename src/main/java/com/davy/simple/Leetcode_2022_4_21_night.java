package com.davy.simple;

/**
 * @author Davy
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Leetcode_2022_4_21_night {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"abcp","abcde","abcal"};
        System.out.println(new Leetcode_2022_4_21_night().longestCommonPrefix(strs));
    }
}
