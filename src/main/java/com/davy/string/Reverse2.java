package com.davy.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Davy
 * <p>
 * 整数反转
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class Reverse2 {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int temp = res * 10 + x % 10;
            if(temp / 10 != res){
                return 0;
            }
            res = temp;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
    }
}
