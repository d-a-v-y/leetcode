package com.davy.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Davy
 * 给定一个整数数组 nums和一个整数目标值 target，
 * 请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class Leetcode_2022_4_20 {
    public static int[] twoSum(int[] nums, int target) {//方法1
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(len-1);
        map.put(nums[0],0);
        for(int i = 1;i < len;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

    public static int[] twoSum2(int[] nums, int target) {//方法2
        int len = nums.length;
        for(int i = 0;i < len - 1;i++){
            for(int j = i+1;j < len;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1,3,2,6}, 8);
        for(int i = 0;i < ints.length;i++){
            System.out.println(ints[i]);//显示的是下标
        }
    }
}
