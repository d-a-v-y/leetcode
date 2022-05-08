package com.davy.string;

/**
 * @author Davy
 */
public class New_Count_Say {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int tmp = 0;
            while (tmp < str.length()) {
                while (tmp < str.length() && str.charAt(tmp) == str.charAt(start)) {
                    tmp++;
                }
                sb.append(tmp - start).append(str.charAt(start));
                start = tmp;
            }
            str = sb.toString();
        }
        return str;
    }
}
