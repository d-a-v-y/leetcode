package com.davy.string;

/**
 * @author Davy
 * <p>
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestPublicPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (strs == null || len == 0) {
            return "";
        }
        int count = strs[0].length();
        for (int i = 0; i < count; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}