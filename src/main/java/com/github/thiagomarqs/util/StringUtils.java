package com.github.thiagomarqs.util;

public class StringUtils {

    public static String reverse(String s) {
        if(s == null) return "";

        return new StringBuilder(s).reverse().toString();
    }

}
