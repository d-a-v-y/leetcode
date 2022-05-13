package com.davy.tree;

/**
 * @author Davy
 * <p>
 * 对称二叉树
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class Symmetric {
    public boolean isSymmetric(TreeNode3 root) {
        return isSymmetric(root,root);
    }

    public boolean isSymmetric(TreeNode3 node1,TreeNode3 node2) {
        if(node1 == null && node2 == null){
            return true;
        }else if(node1 == null || node2 == null){
            return false;
        }
        return (node1.val == node2.val) && isSymmetric(node1.left,node2.right) && isSymmetric(node1.right,node2.left);
    }
}

class TreeNode3 {
    int val;
    TreeNode3 left;
    TreeNode3 right;

    TreeNode3() {
    }

    TreeNode3(int val) {
        this.val = val;
    }

    TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
