package com.davy.math;

/**
 * @author Davy
 * 计数质数
 * 给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
 */
public class Primes {

    public int countPrimes(int n) {
        int count = 0;
        if (n <= 2) {
            return 0;
        } else {
            boolean tip = true;
            for (int i = 2; i < n; i++) {
                int j = 2;
                if (tip) {
                    ++count;
                }
                tip = true;
                while (j < i) {
                    if (i % j == 0) {
                        tip = false;
                        break;
                    }
                    ++j;
                }
            }
        }
        return count;
    }
}