package com.davy.string;

/**
 * @author Davy
 * <p>
 * 反转字符串
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 */
public class Reverse {
    public void reverseString(char[] s) {
        int len = s.length;
        char temp;
        for (int i = 0, j = len - 1;i < j; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
