package com.pers.util;

public class GenerateNumberCardUtil {

    public static Long generateNumber() {
        return (long) (Math.random() * 100000000L + 7733100000L);
    }
}
