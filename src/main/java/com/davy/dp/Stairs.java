package com.davy.dp;

/**
 * @author Davy
 */
public class Stairs {
    public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for(int i = 0;i < n;i++){
            q = p;
            p = r;
            r = p+q;
        }
        return r;
    }
}