package com.davy.tree;

import java.util.Stack;

/**
 * @author Davy
 * 验证二叉搜索树
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 有效 二叉搜索树定义如下：
 * <p>
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class ValidBST {

    public boolean isValidBST(TreeNode1 root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode1 node,long lower,long upper){
        if(node == null){
            return true;
        }else if(node.val <= lower || node.val >= upper){
            return false;
        }
        return isValidBST(node.left,lower,node.val) && isValidBST(node.right,node.val,upper);
    }
}

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}