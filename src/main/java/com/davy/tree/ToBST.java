package com.davy.tree;

/**
 * @author Davy
 */
public class ToBST {
    public TreeNode5 sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length -1);
    }

    public TreeNode5 helper(int[] nums,int left,int right){
        if(left > right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode5 root = new TreeNode5(nums[mid]);
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums,mid+1,right);
        return root;
    }
}


class TreeNode5 {
    int val;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5() {
    }

    TreeNode5(int val) {
        this.val = val;
    }

    TreeNode5(int val, TreeNode5 left, TreeNode5 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}