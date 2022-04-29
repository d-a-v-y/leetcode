package com.davy.array;

import java.util.*;

/**
 * @author Davy
 * <p>
 * 两个数组的交集 II
 * <p>
 * 给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * 可以不考虑输出结果的顺序。
 */
public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ints = new int[Math.min(len1, len2)];
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while (index1 < len1 && index2 < len2) {
            if(nums1[index1] < nums2[index2]){
                ++index1;
            }else if(nums1[index1] > nums2[index2]){
                ++index2;
            }else {
                ints[index] = nums1[index1];
                ++index;
                ++index1;
                ++index2;
            }
        }
        return Arrays.copyOfRange(ints,0,index);
    }
}
