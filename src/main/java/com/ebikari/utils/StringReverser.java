package com.ebikari.utils;

public class StringReverser {

    public static String reverse(String str) {
        if (str == null) throw new IllegalStateException("str may not be null");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
