package com.davy.others;

import java.util.*;

/**
 * @author Davy
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class Valid {
    public boolean isValid(String s) {
        int len = s.length();

        if(len % 2 != 0){
            return false;
        }

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Deque<Character> stack = new LinkedList<>();
        for(int i = 0;i < len;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty() || stack.peek() != map.get(c)){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}