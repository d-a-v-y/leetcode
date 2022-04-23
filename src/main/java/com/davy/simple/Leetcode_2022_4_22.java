package com.davy.simple;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Davy
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class Leetcode_2022_4_22 {

    public boolean isValid(String s) {
        int count = s.length();
        if (count % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < count;i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))==deque.peek()){
                    deque.pop();
                }else {
                    return false;
                }
            }else{
                deque.push(s.charAt(i));
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode_2022_4_22().isValid("[]()"));
    }
}
