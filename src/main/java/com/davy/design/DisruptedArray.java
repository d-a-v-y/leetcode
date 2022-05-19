package com.davy.design;

import java.util.Random;

/**
 * @author Davy
 * 打乱数组
 * 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。打乱后，数组的所有排列应该是等可能的。
 * <p>
 * 实现 Solution class:
 * <p>
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 */
public class DisruptedArray {

    /*int[] nums;
    int[] original;

    public Solution(int[] nums) {
        this.nums = nums;
        int len = nums.length;
        this.original = new int[len];
        System.arraycopy(nums, 0, original, 0, len);
    }

    public int[] reset() {
        int len = nums.length;
        System.arraycopy(original, 0, nums, 0, len);
        return nums;
    }

    public int[] shuffle() {
        int len = nums.length;
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            int j = i + random.nextInt(len - i);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }*/
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */