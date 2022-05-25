package com.davy.math;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Davy
 * 罗马数字转整数
 * 罗马数字包含以下七种字符:I，V，X，L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 */
public class RomanToInt {
    Map<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = s.length();
        int res = 0;
        for (int i = 0; i < len; i++) {
            int str = map.get(s.charAt(i));
            if (i < len - 1 && str < map.get(s.charAt(i + 1))) {
                res -= str;
            } else {
                res += str;
            }
        }
        return res;
    }
}
