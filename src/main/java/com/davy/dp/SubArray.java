package com.davy.dp;

/**
 * @author Davy
 * 最大子序和
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 子数组 是数组中的一个连续部分。
 */
public class SubArray {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int max = nums[0];
        for (int x : nums) {
            i = Math.max(i + x, x);
            max = Math.max(max,i);
        }
        return max;
    }
}
