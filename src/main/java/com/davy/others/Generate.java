package com.davy.others;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Davy
 * 杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 *
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i < numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    l.add(1);
                }else {
                    l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(l);
        }
        return list;
    }
}
