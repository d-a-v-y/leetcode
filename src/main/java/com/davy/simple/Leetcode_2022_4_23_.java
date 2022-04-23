package com.davy.simple;

/**
 * @author Davy
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，
 * 使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 */
public class Leetcode_2022_4_23_ {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0){
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while(fast < length){
            if(nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
