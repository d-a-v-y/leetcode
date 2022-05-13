package com.davy.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Davy
 * 二叉树的层序遍历
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
public class LevelOrder {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode4 root) {
        dns(root,0);
        return list;
    }
    public void dns(TreeNode4 root,int lever){
        if(root == null){
            return;
        }
        if(list.size() == lever){
            list.add(new ArrayList<Integer>());
        }
        list.get(lever).add(root.val);
        dns(root.left,lever+1);
        dns(root.right,lever+1);
    }
}

class TreeNode4 {
    int val;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4() {
    }

    TreeNode4(int val) {
        this.val = val;
    }

    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}