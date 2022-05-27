package com.davy.others;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Davy
 * 丢失的数字
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int total = len * (len + 1) / 2;
        int missing = 0;
        for(int i = 0;i < len;i++){
            missing += nums[i];
        }
        return total - missing;
    }
}
