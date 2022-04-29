package com.davy.array;

import java.util.Arrays;

/**
 * @author Davy
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * <p>
 * 方法一：使用额外的数组
 * 我们可以使用额外的数组来将每个元素放至正确的位置。用 nn 表示数组的长度，我们遍历原数组，
 * 将原数组下标为 ii 的元素放至新数组下标为 (i+k) mod n 的位置，最后将新数组拷贝至原数组即可。
 */
public class OverTurn {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        new OverTurn().rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
