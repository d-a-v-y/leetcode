package com.davy.array;

/**
 * @author Davy
 */
public class DeleteRepetition {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int slow = 1;
        int fast = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
