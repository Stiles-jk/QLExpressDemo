package com.ql;

/**
 * @auther Stiles-JKY
 * @date 2020/8/31-19:46
 */
public class Methods {

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static String toUpper(String str) {
        return str.toUpperCase();
    }

    //用于测试addFunctionOfServiceMethod
    public boolean isContains(String str, String subStr) {
        if (str == null || subStr == null) {
            return false;
        }
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (subStr.contains(c + "")) {
                return true;
            }
        }
        return false;
    }
}
