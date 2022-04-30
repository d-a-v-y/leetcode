package com.davy.array;

/**
 * @author Davy
 *
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0;i < len;i++){
            if(nums[i] == 0){
                ++count;
            }
            if(nums[i] != 0 && i != 0){
                nums[i - count] = nums[i];
            }
        }
        for(int i = count;i > 0;i--){
            nums[len - i] = 0;
        }
    }
}
