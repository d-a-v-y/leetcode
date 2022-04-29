package com.davy.array;

/**
 * @author Davy
 */
public class CenterIndex {

    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        int sumLeft = 0;
        for (int j = 0; j < len; j++) {
            sum -= nums[j];
            if (sum == sumLeft) {
                return j;
            }
            sumLeft+=nums[j];
        }
        return -1;
    }
}
