package com.davy.others;

/**
 * @author Davy
 * 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * <p>
 * 提示：
 * <p>
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，
 * 并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的示例 3 中，输入表示有符号整数 -3。
 */
public class HammingWeight {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.indexOf(i) == 1) {
                ++count;
            }
        }
        return count;
    }
}
