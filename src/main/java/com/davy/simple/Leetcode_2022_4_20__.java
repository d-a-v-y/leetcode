package com.davy.simple;

/**
 * @author Davy
 * <p>
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Leetcode_2022_4_20__ {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }
        return revertedNum == x || x == revertedNum/10;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode_2022_4_20__().isPalindrome(123454321));
    }
}
