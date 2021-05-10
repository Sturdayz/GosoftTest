package com.devskiller.utils;

public class StringHelper {

    public static String reverse(final String input) {
        String result = "";
        if (input.length() > 0) {
            for (int i = input.length()-1; i>=0 ; i--) {
                result += input.charAt(i);
            }
        }
        else{
            throw new IllegalArgumentException("illegalArgumentException");
        }
        return result;
    }



    public static String substring(final String input, final int index) {
        String result = "";
        String splitSpace[] = input.split(" ");
        if (splitSpace.length >= index && !input.isEmpty()) {
            result = splitSpace[index - 1];
        }
        else {
            throw new IllegalArgumentException("illegalArgumentException");
        }
        return result;
    }
}
